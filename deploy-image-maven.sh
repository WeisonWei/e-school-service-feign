#!/bin/sh
params="-DskipTests -P local-nexus-repo,registry2,!build-swagger2markup-asciidoctor"

DIR=`dirname $0`
echo ${DIR}
#cd ${DIR}/../school-service-student/ && ./mvnw clean install ${params}
#cd ${DIR}/ && ./mvnw  clean deploy ${params}
cd ${DIR}/../e-school-service-feign/ && ./mvnw clean deploy ${params}
