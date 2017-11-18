#!/bin/sh
### 配合Jenkins进行自动部署
nohup java -jar ${WORKSPACE}/pmp-ams/target/ams-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-ams.out &
nohup java -jar ${WORKSPACE}/pmp-auth/target/auth-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-auth.out &
nohup java -jar ${WORKSPACE}/pmp-cms/target/cms-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-cms.out &
nohup java -jar ${WORKSPACE}/pmp-gms/target/gms-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-gms.out &
nohup java -jar ${WORKSPACE}/pmp-hms/target/hms-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-hms.out &
nohup java -jar ${WORKSPACE}/pmp-ims/target/ims-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-ims.out &sh
nohup java -jar ${WORKSPACE}/pmp-pms/target/pms-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-pms.out &
nohup java -jar ${WORKSPACE}/pmp-api/target/api-1.0.0-SNAPSHOT.jar --spring.profiles.active=test > /var/log/pmp/pmp-api.out &