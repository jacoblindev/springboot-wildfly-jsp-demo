FROM quay.io/wildfly/wildfly
ARG WAR_FILE=*.war
COPY ${WAR_FILE} /opt/jboss/wildfly/standalone/deployments/
# RUN /opt/jboss/wildfly/bin/add-user.sh admin Admin#123 --silent
EXPOSE 8080 9990
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]