# Spring Boot and Kafka integration
Example to demo Spring Boot and Kafka integration

1. Download the 2.3.0 release and un-tar it. 
2. cd {KAFKA_HOME} 
3. bin\windows\zookeeper-server-start.bat config\zookeeper.properties
4. bin\windows\kafka-server-start.bat config\server.properties
5. bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic user
6. 