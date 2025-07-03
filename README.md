🚨 Real-Time Fraud Detection System – README
📌 Overview
This system simulates real-time fraud detection for financial transactions using a microservice architecture. It ingests transaction events, applies fraud rules, and generates alerts instantly.

📈 This project demonstrates real-time streaming, event-driven architecture, Kafka-based messaging, Redis caching, and system observability – making it ideal for senior backend roles.

🏗️ Architecture Diagram
                           +------------------------+
                           |   Transaction Client   |
                           |  (Mobile / Backend)    |
                           +-----------+------------+
                                       |
                                       ▼
                      +-------------------------------+
                      |    Transaction REST Service    |
                      |   (Spring Boot, Kafka Prod.)   |
                      +---------------+---------------+
                                      |
                          Kafka Topic: "transactions"
                                      ▼
                    +-------------------------------+
                    |    Fraud Detection Service     |
                    |  (Kafka Consumer + Rule Engine)|
                    +---------------+---------------+
                                    |
               +--------------------+--------------------+
               |                    |                    |
               ▼                    ▼                    ▼
      Redis (cache)        PostgreSQL (storage)  Elasticsearch (search)
  (e.g., daily limits)     (transaction log DB)     (fraud alert index)

                                    |
                                    ▼
                      +-----------------------------+
                      |    Alerting Service          |
                      |  (email/SMS/logger/webhook)  |
                      +-----------------------------+

