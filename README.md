<img width="2174" height="2268" alt="image" src="https://github.com/user-attachments/assets/0de9c5f4-bffb-489a-ba3d-1722176f1df8" /># rapid-migrate-platform
Enterprise Data Migration Platform for extraction, mapping, transformation, validation, ingestion, and reconciliation workflows using Java, Spring Boot, PostgreSQL, Redis, Kafka, React, Docker, and Kubernetes.

Rapid Migrate Platform
Enterprise Data Migration Platform for extraction, mapping, transformation, validation, ingestion, and reporting workflows.

Overview
Rapid Migrate Platform is a full-stack application that helps organizations migrate data from legacy systems to modern platforms through configurable migration workflows.

The platform supports:

Config Set Management
Extraction
Mapping
Transformation
Validation
Ingestion
Reporting
Tech Stack
Backend
Java 21
Spring Boot 3
Spring Security
Spring Data JPA
PostgreSQL
Frontend
React
Material UI
Axios
Infrastructure
Redis
Kafka
Docker
Kubernetes
Testing
JUnit 5
Mockito
Testcontainers

Architecture
Source System
      |
      v
 Extraction
      |
      v
   Mapping
      |
      v
Transformation
      |
      v
 Validation
      |
      v
  Ingestion
      |
      v
 Target System
      |
      v
  Reporting
Supported Sources (Future)
CSV
Excel
JSON
Documentum
File Systems
REST APIs
Supported Targets (Future)
Veeva Vault
Salesforce
SAP
Custom APIs

Core Modules
Config Set
Creates migration configurations that drive extraction, mapping, transformation and ingestion workflows.

Extraction
Processes uploaded source files and extracts metadata and records.

Mapping
Maps source fields to target fields.

Example:

Source Field	Target Field
customer_id	customerId
status	statusCode
Transformation
Applies business rules and data conversions.

Validation
Performs data quality checks before ingestion.

Ingestion
Loads transformed data into target systems.

Reporting
Provides execution summary and validation reports.

Deployment
Development
docker compose up -d
Services
Backend API
PostgreSQL
Redis
Kafka
Planned Deployment
Frontend:

Vercel
Backend:

Render
Alternative:

AWS EC2

## Author

Ajay Varma Nandre

Java | Spring Boot | PostgreSQL | Redis | Kafka | Docker | Kubernetes

