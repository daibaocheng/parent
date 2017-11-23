package com.vankeytech.pmp.auth.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authc.pam.AbstractAuthenticationStrategy;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * {@link AuthenticationStrategy} implementation that only accepts the account
 * data from the first successfully consulted Realm and ignores all subsequent
 * realms. This is slightly different behavior than
 * {@link AtLeastOneSuccessfulStrategy}, so please review both to see which one
 * meets your needs better.
 * 
 * @see AtLeastOneSuccessfulStrategy AtLeastOneSuccessfulAuthenticationStrategy
 * @since 0.9
 */
public class AnySuccessfulStrategy extends AbstractAuthenticationStrategy {

    /**
     * Returns {@code null} immediately, relying on this class's {@link #merge
     * merge} implementation to return only the first {@code info} object it
     * encounters, ignoring all subsequent ones.
     */

    public AuthenticationInfo beforeAllAttempts(Collection<? extends Realm> realms, AuthenticationToken token){
        return null;
    }

    /**
     * Returns the specified {@code aggregate} instance if is non null and valid
     * (that is, has principals and they are not empty) immediately, or, if it
     * is null or not valid, the {@code info} argument is returned instead.
     * <p/>
     * This logic ensures that the first valid info encountered is the one
     * retained and all subsequent ones are ignored, since this strategy
     * mandates that only the info from the first successfully authenticated
     * realm be used.
     */
    @Override
    protected AuthenticationInfo merge(AuthenticationInfo info, AuthenticationInfo aggregate) {
        if (aggregate != null && !CollectionUtils.isEmpty(aggregate.getPrincipals())) {
            return aggregate;
        }
        return info != null ? info : aggregate;
    }

    @Override
    public AuthenticationInfo afterAttempt(Realm realm, AuthenticationToken token, AuthenticationInfo singleRealmInfo, AuthenticationInfo aggregateInfo, Throwable t){
        if (singleRealmInfo == null) {
            if (t.getClass().isAssignableFrom(LockedAccountException.class)) {
                throw new LockedAccountException(t.getMessage());
            } else if (t.getClass().isAssignableFrom(UnknownAccountException.class)) {
                throw new UnknownAccountException(t.getMessage());
            } else if (t.getClass().isAssignableFrom(IncorrectCredentialsException.class)) {
                throw new IncorrectCredentialsException(t.getMessage());
            } else if (t.getClass().isAssignableFrom(ExcessiveAttemptsException.class)) {
                throw new ExcessiveAttemptsException(t.getMessage());
            }
            throw new AuthenticationException(t.getMessage());
        }
        return super.afterAttempt(realm, token, singleRealmInfo, aggregateInfo, t);
    }

}
