# SPRING-CLOUD-STREAMS-FUNCTION
>download kafka dossiez zip(kafka_2.13-3.1.0)
C:\Users\Desktop\tools\kafka>start kafka_2.13-3.1.0\bin\windows\zookeeper-server-start.bat config\zookeeper.properties
-->ZOOKEEPER:un serveur mémoire chache distribué qui assure la coordination entre les instances du broker(cluster broker) et ces consommateurs
>start zookeeper server
>C:\Tools\kafka\bin\windows>start zookeeper-server-start.bat C:\Tools\kafka\config\zookeeper.properties
>start kafka server
>C:\Tools\kafka\bin\windows>start kafka-server-start.bat C:\Tools\kafka\config\server.properties
>test et lancer (produce/consume) message console
C:\Tools\kafka\bin\windows>start kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic T1
C:\Tools\kafka>start bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic T1
>Create topic
C:\Tools\kafka>start bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic kachtopic
>list down of availabale topics
C:\Tools\kafka>start bin\windows\kafka-topics.bat --list --zookeeper localhost:2181

######STREAM PROCESSING VIA KAFKA STREAM sans utliser de cluster broker comme spark####

--property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer
--property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
