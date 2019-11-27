FROM java

ADD ./target/*.jar /

EXPOSE 8088

CMD java -jar ModernizedNewPaymentPlatform-0.0.1-SNAPSHOT