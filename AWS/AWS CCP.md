# Overview

The AWS Certified Cloud Practitioner (CCP) exam tests knowledge of the AWS Cloud and its services.

## What is AWS?

A cloud computing service provider.

AWS allows businesses of any size to replace capital infrastructure expenses like physical servers with the servers provided by AWS. This makes it quicker to deploy applications and for them to scale up as the business grows.

<br>

# AWS Cloud Practitioner Essentials

## Module 1: Introduction

### Client-Server Model

The Client-Server Model describes the interaction between the client and server. The client makes a request and the server responds to it.

### Pricing

AWS only charges clients for the services they use, and only when they use them.

### What is Cloud Computing?

The on-demand delivery of IT resources over the internet with pay-as-you-go pricing.
 
Clients can use different deployment models based on their business needs.

- Cloud deployment: total deployment of business resources on the virtual cloud (virtual servers, databases, etc.)
- On-premises deployment: retaining infrastructure and resources on the physical premises
- Hybrid: making use of both cloud and on-premises resources - ideal for keeping legacy applications, but using advanced cloud processing

### Benefits of the AWS Cloud

1. Trade fixed expense for variable expense
2. Benefit from massive economies of scale
3. Stop guessing capacity
4. Increase speed and agility
5. Stop spending money to run and maintain data servers
6. Go global in minutes

### AWS Global Infrastructure

AWS operates in many regions around the world, which contain many Availability Zones (AZ). These zones contain physical data centers that can store and run resources for businesses.

Businesses can run their application across many regions so that if one region is facing disruptions, the application still remains operational.

### AWS Shared Responsibility Model

The Shared Responsibility Model dictates the responsibilities of AWS, the customer, and those that could be either or.

AWS handles the security of the cloud, updating the virtual resources they provide and also managing the hardware and physical infrastructure of their services.

Customers must handle their own security in the cloud, managing their own data and encryption.

## Module 2: Compute in the Cloud

### Amazon Elastic Compute Cloud (EC2)

EC2 is a service that provides servers for businesses. An EC2 instance is a virtual machine that shares the underlying hardware with other instances, but still remains isolated (multi-tenancy principle).

As with the pay-as-you-go pricing model, AWS only charges customers for running instances, and not stopped or terminated ones.

### Instance Types

There are different types of EC2 instances for different use cases:

1. General purpose: for diverse workloads
2. Compute optimised: for gaming servers
3. Memory optimised: for processing large datasets
4. Accelerated computing: for using GPUs
5. Storage optimised: for locally stored data

### Provisioning AWS Resources

Customers can interact with the AWS environment via the console (website UI), the AWS CLI, or the AWS SDK. Since AWS services are essentially exposed as APIs, they can be called or invoked through programming languages.

*Since a resource like an EC2 instance is an unmanaged resource, the customer must handle the operating system, networking, and applications within the instance

### Launching an EC2 Instance

EC2 Instances need to be launched within an Amazon Machine Image (AMI). AMIs are pre-built virtual machines that contain the operating system, server, and the application (i.e. the instance).

Launching the instance requires the type of operating system, AMI, and storage option to be specified.

### EC2 Pricing

AWS EC2 allows customers to purchase unused capacity via services known as 'instances':

| Instance | Description
| - | -
| Reserved | Reserve some capacity for usage at up to 75% off - good for use cases with predictable usage
| On-Demand | Offers immediately available capacity when purchased (not discounted) - only pay for duration the instance is running (per hour or per second)
| Dedicated | Run in VPCs dedicated to a single customer, used when there are licensing and compliance constraints (not discounted) - good for security sensitive workloads
| Spot | Offers customers unused EC2 capacity at up to 90% off - but AWS can reclaim instance at any time, best used for lower commitments
| Savings Plans | Costs are measured in dollars per hour for 1 year or 3 years

Dedicated Hosts offer a higher level of control than Dedicated Instances (use of physical servers and resource allocation) - Dedicated Instances still offer control, but only isolation and NOT the whole physical server.

### Scaling EC2

Scalability: system's potential to grow over time (long-term) - scale up by adding more power or machines

Elasticity: dynamic, on-demand adjustment of resources (short-term) - provides cost efficiency and optimal resource usage

EC2 Auto Scaling automatically ensures that the right amount of instances are running for the demand. Dynamic scaling adjusts in real time while Predictive scaling preemptively schedules the instances based on anticipated demand.

Each Auto Scaling Group has a minimum, desired, and maximum capacity for instances which can be set by the customer.

### Elastic Load Balancer (ELB)

Load Balancers reroute traffic to available EC2 instances to prevent overloading at a single one. The ELB acts as a middleman between frontend and backend instances. The ELB also automatically adjusts to the number of instances controlled by the EC2 Auto Scaler. 

The ELB has different routing methods to ensure efficient traffic management:

| Method | Description
| - | -
| Round Robin | Distributes traffic cyclically to available servers
| Least Connections | Routes traffic to the server with the fewest active connections
| IP Hash | Uses the client's IP address to consistently route traffic to the same server
| Least Response Time | Directs traffic to the server with the fastest response time

### Messaging and Queuing

The Amazon Simple Queue Service (SQS) and Amazon Simple Notification Service (SNS) are AWS services that decouple software architecture components.

SQS allows for messages to be sent, stored, and received by different software components - an SQS Queue hold messages until they are processed

SNS is similar but do not hold the messages for pickup - the response must be instantaneous

Monolithic architectures are tightly coupled that can break entirely if one service breaks. Microservices architectures are loosely coupled so that the whole application can continue running even if one part of it breaks.

EventBridge is a severless service that connects different parts of an application using events - it can route events from apps or AWS services to other apps. *Even if one service fails, EventBridge can store the event and process it once the service is available again

## Module 3: Exploring Compute Services

### Severless Computing

An unmanaged service like EC2 has its underlying physical infrastructure set up by AWS while the customer is reponsible for setting up and maintaining the instance. A managed service reduces the customer responsibilities.

Fully-managed services, like serverless ones, reduce even more customer responbilities such that servers do not need to be provisioned or managed. AWS Lambda is a serverless service.

In terms of customer responsbility: unmanaged > managed > fully-managed

### AWS Lambda

Lambda runs code (function) in response to events without the need of a server. It automatically scales resources based on the volume of requests. Each Lambda function only costs for the compute time used.

In an app, an event triggers the function to be run, which can be written in any programming language using a provided or custom runtime.

### Containers and Orchestration

An application on AWS needs to be containerised, orchestrated, and run on an server.

AWS Elastic Container Registry (ECR) stores container images to be used by orchestration services like Elastic Container Service (ECS) or Elastic Kubernetes Service (EKS). The orchestrated container images can then be run on EC2 or Fargate.

Containers are more lightweight than Virtual Machines (VM) as they share the host computer's operating system, instead of VMs, which use a hypervisor to run full, separate operating systems.

As containerised applications scale up, more and more container images are used in many different hosts -> orchestration services help to automate the scaling and deployment of containers.

### Other Compute Services

Elastic Beanstalk is a fully managed service that automatically handles provisioning and scaling for a piece of code - supports various programming languages and good for deploying web applications.

Batch is also a fully managed service that runs batch computing workloads and automatically scales resources for them - good for processing large-scale workloads.

Lightsail offers virtual private servers (VPSs) for basic workloads (more lightweight than other services).

Outposts is a fully managed hybrid cloud solution that extends AWS infrastructure to on-premises data centers - good for migrating and modernising legacy applications.

## Module 4: Going Global

### Global Infrastructure

AWS has services that allow a business to go beyond just a single region. A business can expand by opening smaller versions in edge locations, which can provide the more popular services of the business, but not all.

CloudFormation is a service that uses infrastructure as code (IaC) to maintain a consistent product between locations.

### Choosing AWS Regions

The following factors must be considered when choosing an AWS region to expand into:

1. Compliance - a region that has data laws may restrict the data within a single place, preventing data from moving out and limiting the expansion
2. Proximity - most of a business' consumers may reside within a single region
3. Features - not all AWS regions contain every AWS service
4. Pricing - some regions have lower operational costs than others

### Availability Zones and Edge Locations

AWS provides various availability zones to deploy applications and the associated AWS resources in. Deploying an application in multiple availability zones **prevents a single point of failure** and **increases application availability** - if a problem occurs in one availability zone, the others are not affected.

This also **reduces latency** for the application's global performance, which can be done through `CloudFront` by deploying the application in **edge locations** that are placed outside of AWS regions.

### AWS CloudFormation

CloudFormation is a service that models and sets up AWS resources using a user-specified template. Infrastructure can be defined as code, which removes the chance of human error as compared to manually setting up services.

## Module 5: Networking

### Networking Services

AWS allows customers to isolate resources using a Virtual Private Cloud (VPC), preventing public access to them. Subnets are used to organise resources into publicly and privately accessible ones.

AWS architects infrastructure based on the region, AZs, and subnets within those AZs, which can reside within a VPC. If there are public subnets within a VPC, an internet gateway is provided for public access. 

### Organising AWS Cloud Resources

Amazon VPC provides an isolate section of the AWS cloud to organise resources. It increases security as connections can be monitored, gives full control over the resource placement, and saves time as it is quicker for VPC to set up and manage resources.

A VPN creates a secure connection tunnel through the internet. A Virtual Private Gateway allows this connection into a VPC, which can be used to access secure on-premises data or a corporate network.

*A Network Address Translation (NAT) Gateway is a managed AWS service that allows instances to connect to the internet, but not for the internet to connect to them.

### Connecting to the AWS Cloud

A business using AWS may have its workers at different network locations - the main office, a data center, or working from home. AWS provides different types of VPNs for such accesses.

| VPN | Description
| - | -
| Client VPN | Connects remote workers and on-premises networks to AWS Cloud - a fully-managed and elastic service that provides authentication
| Site-to-Site VPN | Connects a private data center to AWS Cloud resources - used for application migration and communication between different locations
| PrivateLink | Connects a VPC to services as if they were within the VPC - simplifies connection as no internet gateway or other connections are needed
| Direct Connect | Establishes a dedicated private connection between a network and VPC within the AWS Cloud - food for latency-sensitive apps, large-scale data migration, and hybrid cloud architectures

### Subnets, Security Groups, and Network Access Control Lists (ACL)

Subnets exist within a VPC and house public and private resources. These subnets communicate with one another by sending packets. These packets are checked by a network ACL to enter and exit a subnet.

A default network ACL is provided for every AWS account, but can also be custom-specified. For example, a packet can be allowed to enter a subnet, but not be allowed to leave.

After a packet enters a subnet, its permissions must be checked for individual AWS resources within the subnet (like an EC2 instance). A security group checks these permissions.

By default, a security group allows all outbound traffic and denies all inbound traffic. Custom security groups can be configured to allow certain packets.

| Network ACL | Security Group
| - | -
| Subnet level | Instance level
| Stateless | Stateful
| Both 'allow' and 'deny' type rules | Only 'allow' type rules
| Return traffic must be allowed in both directions | Automatically allowed if inbound traffic is allowed
| Broad control | Fine-grained control

*As part of the Shared Responsibility Model, customers are responsible for securing the subnets and VPC resources using network ACLs and security groups

### Creating a VPC

Creating a VPC involves creating private and public subnets. A created public subnet does not yet work until an internate gateway is created. A route table must also be created to assign routes to specific subnets.

*The smallest allowed CIDR block that can be created for a VPC is /28. This provides 16 total IP addresses, where AWS reserves 5, leaving 11 usable ones.

### Global Networking

A Domain Name Service (DNS) is a translation service that translates a website/ domain name into an IP address (resolution).

Route 53 is an AWS DNS that routes end users to internet apps. It also allows customers to register new domain names directly and manage them.

Route 53 also works with CloudFront, a content delivery network (CDN) to improve content delivery to users. Instead of routing all requests to the original server, CloudFront stores copies of content at locations closer to users. The request is also sent to the app's load balancer to scale up more EC2 instances if needed.

Global Accelerator improves an app's availability by creating a dedicated lane in the AWS private global network for internet traffic.

### Global Architectures

A business may want to transfer large amounts of data to a VPC. This can be done through AWS Direct Connect, which is a physical hard-wired connection to a VPC through a virtual private gateway.

Delivering content to several AWS regions can be done through Route 53 and CloudFront. A user requests data through an app, which is passed to Route 53 to decide which CloudFront edge location to send the request to. The data is then fetched from the closest region.

## Module 6: Storage

### Types of Storage

There are different types of storage for data.

| Storage | Description
| - | -
| Block | Divides data into storage blocks which can be attached to instances like physical hard drives
| Object | Stores data in a flat, unstructured way to allow for unlimited scalability
| File | Uses shared file systems so multiple users and apps can access the same data at the same time
| Others | Storage Gateway offers on-premises access to cloud storage<br>Elastic Disaster Recovery streamlines the recovery of cloud-based servers in AWS

### Block Storage

AWS offers two forms of block storage: Amazon EC2 instance store and Elastic Block Store (EBS).

EC2 instance store is not a stand-alone service, but the block-level storage that is attached to the EC2 instance host computer. This store is non persistent as stopped EC2 instances may start on a different host computer, which loses the previously stored block data.

EBS is a stand-alone service that offers persistent storage for use with EC2 instances as they attach as separate volumes to the instance. EBS volumes are automatically replicated within the same AZ to provide consistent and low-latency access to data.

### EBS Lifecycle

EBS stores data incrementally by taking a snapshot of the data every day - it builds upon the previous snapshot by only changing saving snapshots of what is changed.

Many snapshots are taken and can be managed using the Amazon Life Cycle Manager, which automates the creation and management of EBS snapshots. This can be done by setting a policy for the snapshots.

### Object Storage

The main AWS service for object storage is Simple Storage Service (S3). S3 is a fully managed, durable, object storage service for storing and retrieving virtually any amount of data. Each object is stored in an S3 bucket, which allows for versioning and recovery of each object.

Objects can be of any file type and range in size from a few bytes to terabytes. Each object includes the data, metadata, and a unique identifer/ key. Buckets have a global name across AWS and can be placed within a region.

Access to objects within S3 buckets can be designated by bucket policies (attached to buckets) or identity-based policies (attached to users). Every object stored is private by default and must be explicitly granted access to.

### S3 Storage

Storing data in S3 has different costs depending on the storage class used. A storage class caters to a specific storage need.

| Storage | Description
| - | -
| Standard | General purpose storage for everything
| Standard Infrequent Access (IA) | Good for less frequently accessed data, but that requires rapid access when needed
| Intelligent Tiering | Good to use for when data has unknown or changing access patterns - automatically moves data to most cost-effective storage based on frequency
| Glacier Instant Retrieval | Same as Standard but has lower storage cost and instantly accesses data
| Glacier Flexible Retrieval | Takes slightly longer to retrieve than Instant Retrieval
| Glacier Deep Archive | Used to store things that will rarely be accessed (best for compliance storage)
| One Zone | Stores data in a single AZ to consistently deliver quick data access
| One Zone Infrequent Access (IA) | Stores data in a single AZ and has lower costs than Standard-IA
| Outposts | Delivers object storage to on-premises AWS Outposts

The customer has the responsibility to manage S3 storage tiers. This can be done through S3 Lifecycle configurations to automate when objects should transition to another storage class or be deleted.

### Elastic File System (EFS)

EFS is a fully managed file storage service that automatically scales as files are added or removed. It can be accessed by multiple EC2 instances simultaneously and uses the Linux Network File System (NFS) protocol. Like S3, EFS also has different storage classes.

| Storage | Description
| - | -
| Standard<br>Standard IA | Offer multi-AZ resilience and highest levels of durability, but higher costs
| One Zone<br>One Zone IA | Single AZ
| Archive | For long-term data that is rarely accessed

Like S3, EFS Lifecycle configurations can be made to transition files to different storage classes after a certain period of time.

### FSx

FSx is a file system that supports multiple filesystem protocols, as compared to just Linux for EFS. Some of these include Windows File Server, NetApp ONTAP, OpenZFS, and Lustre. FSx is best used to migrate workloads from these filesystem protocols onto AWS.

### Storage Gateway

Gateways allow customers still using on-premises workflows to integrate them with AWS. Storage Gateway is a hybrid cloud storage service that allows for moving backups to the cloud, using on-premises file shares, and low-latency access to data in AWS for on-premises applications.

| Gateway Type | Description
| - | -
| File | Store and retrieve cloud objects using file operations - files written are automatically uploaded to S3 while maintaining local access to frequently accessed data through caching
| Volume | Virtual storage volumes that maintain local access to data - can be in *cached mode* (primary data in cloud while frequently accessed data cached) or *stored mode* (complete dataset kept locally)
| Tape | Replaces physical tape infrastructure with virtual tape capabilities - used for backups

### Elastic Disaster Recovery

A recovery service replicates critical workloads to AWS with minimal downtime. Elastic Disaster Recovery works by creating replicating data by block-level with frequent backup intervals. It is best used for when data has to be constantly accessible (i.e. healthcare, finance, manufacturing).

## Module 7: Databases

### Relational Database Services

Transactional data is usually kept in a Relational Database Management System (RDMS). Relational Databases can be powered by different engines, such as MySQL, PostgreSQL, and Oracle. Customers usually have their own on-premises databases, which can be migrated onto AWS using the Database Migration Service (DMS). 

AWS also offers managed database services like Amazon Relational Database Service (RDS) and Aurora. RDS handles database tasks like backups by creating snapshots of the database at points in time, and others. Aurora is also a managed database service that helps reduce unnecessary I/O operations.

| RDS | Aurora
| - | -
| Multi-AZ | Multi-AZ
| Aurora, MySQL, PostgreSQL, Microsoft SQL, MariaDB, Oracle | MySQL, PostgreSQL
| Web apps, enterprise workloads | Gaming apps, media management

### NoSQL Services

A NoSQL database stores data in a non-relational manner, unlike an RDS. Data is stored as key-value pairs, where each key can have various values/ attributes. It is less rigid and has higher performance for evolving datasets that change often.

AWS offers DynamoDB as a fully managed NoSQL database service. It allows for flexible database schema and automatically spreads data across multiple servers to handle workload. It is best used for gaming platforms and financial service apps.

### In-memory Cache

Databases are accessed and queried frequently in many apps. To reduce the latency of these operations, an in-memory cache layer temporarily stores frequently accessed data in RAM. This data can be session data, API responses, or database query results.

ElastiCache is a fully in-memory caching service. It automatically detects and replaces failed cache nodes for apps that require consistent high performance. It is best used for gaming leaderboards, where data needs to be accessed frequently.

### Additional Database Services

AWS offers other database services that fit more specific needs. DocumentDB (with MongoDB compatibility) is a fully managed service that handles semistructured data like JSON documents. It is best used for apps that require frequent data schema changes, like inventory management.

AWS Backup is a dashboard service that streamlines data protection across AWS resources and on-premises deployments. It centralises resources like EBS volumes and EFS file systems, and databases. It is best used for cross-region disaster recovery and for keeping consistent backup policies for compliance.

AWS Neptune is a fully managed graph database service that manages highly connected datasets, like those used in social networking apps. Unlike in a traditional database, Neptune is best at understanding complex relationships between data.

## Module 8: AI/ML and Data Analytics

### AI and ML

Machine Learning (ML) is a type of AI that performs complex tasks without explicit instructions. It finds patterns hidden in historical data and makes predictions based on them. For example, ML can predict trends based on future stock prices, make decisions by routing callers, and detect anomalies like bank fraud.

AWS has an AI/ML stack: AI services that are pre-built and already trained to perform functions, ML services that allow customers to build and train their own models, and ML frameworks that offer a completely custom approach to building models.

### Solutions

#### AI Services

AWS AI services can be split into language, computer vision and search, and conversational/ personalisation services.

Language services are used to interpret text/ speech.

| Service | Description
| - | -
| Comprehend | Uses natural language processing (NLP) to extract key insights from documents
| Polly | Converts text into speech
| Transcribe | Converts speech into text
| Translate | Translates text

Computer vision and search are best for answering questions from various types of content sources (i.e. documents, images, videos).

| Service | Description
| - | -
| Kendra | Uses NLP to search for answers within large amounts of content
| Rekognition | Analyses images and videos stored in S3 to identify objects, people, text, etc.
| Textract | Detects and extracts typed and handwritten text found in documents and forms

Conversational personalisation AI allows users to interact with apps through text and voice conversations.

| Service | Description
| - | -
| Lex | Add voice and text conversational interfaces to apps - uses natural language understanding (NLU) and automatic speech recognition (ASR) to create lifelike convos
| Personalize | Add historical data to build personalised apps (like making personalised recommendations to users)

#### ML Services

ML services offer a more customised approach with SageMaker AI. SageMaker allows customers to build, train, and deploy models without having to worry about infrastructure. It provides an IDE and pre-trained models for quick customisation.

#### ML Frameworks

ML frameworks and infrastructure are completely customisable for customers that have highly specialised needs. AWS supports ML frameworks like PyTorch and TensorFlow, and integrates ML into AWS services like ML-optimised EC2 instances and ECS.

### Generative AI

Deep Learning (DL) is a subset of ML where models are trained using layers that mimic the human brain. Each layer summarises and feeds information to the next layer until a final model is produced.

Generative AI is a type of DL that is powered by very large ML models known as foundational models (FM). LLMs are a popular type of FM trained to use and understand human language.

AWS offers several generative AI solutions:

| Service | Description
| - | -
| SageMarker JumpStart | ML hub with FMs ad pre-built ML solutions<br>Allows for fine-tuning, experimenting, and rapid deployment of pre-trained models without ML experience
| Bedrock | Fully managed service for adapting and deploying FMs from Amazon and other companies<br>Able to generate enterprise apps that use text and images
| Q | Interactive AI assistant that can be integrated with a company's AWS resources<br>Has a Business product that is best used for insight extraction and a Developer product that generates code and reviews it

### Data Analytics

AI/ML and data analytics require good data. AWS offers data pipelines for customers to *extract* the data from various sources and store it, *transform* it into a consistent, usable format, and *load* it into a data warehouse or analytics platform (ETL).

Data analytics transform the data to uncover insights and trends - loan companies can explain lending decisions to customers, medical researches can analyse clinical trial data with hypothesis testing, and insurance companies can make their risk assessment models transparent.

### Data Pipelines

1. **Data ingestion** is the process of moving data from source systems into a storage solution. AWS offers data ingestion services like Kinesis Data Streams, which has real-time ingestion, and Data Firehose, which offers near real-time ingestion.

2. **Data Storage** consolidates data into a single location. Data lakes store vast amounts of raw data while data warehouses store data for business intelligence. S3 is a popular choice for data lakes while Redshift is a fully managed data warehouse service.

3. **Data cataloging** stores data with metadata to keep an inventory. AWS Glue Data Catalog is a service that provides a centralised metadata repository.

4. **Data processing** cleans and transforms the data for analysis. AWS Glue is a fully managed ETL service that works with Glue Data Catalog for the transforming process, while Amazon EMR is ideal for large-scale data processing for orgnisations with big data expertise.

5. **Data analysis and visualisation** tools help develop insights about data. AWS offers services like:

    - Athena, which analyses data through SQL queries
    - Redshift, which not only acts as a data warehouse but as an analysis tool
    - QuickSight, where users can interact with a dashboard to visualise data
    - OpenSearch Service, where content can be searched for and visualised using precise keyword matching

A data pipeline in real life can be set up manually once using these steps and be automated for future use. For example, an e-commerce app stores data in a DynamoDB table. This data is then ingested by Kinesis Data Streams, processed by Firehose, stored in S3, which is cataloged by Glue Data catalog, and analysed by Athena. SageMaker can also use the data for training models.

## Module 9: Security

Apps have to be secured by authenticating and authorising users. AWS ensures security through the Shared Responsibility Model and by offering security controls through services.

### Preventing Unauthorised Access

AWS Identity and Access Management (IAM) is a service that allows customers to restrict or allow access to AWS services. An AWS account has a root user, who is the owner of the account and can do anything with the account. Other people using the account must be given permission before they can perform any actions.

Only permissions that are needed should be granted to users - the principle of least privilege. IAM allows for different identities to be made for different permissions:

| Identity | Description
| - | -
| User | Represents a person that interacts with AWS services/ resources - should be created for individual persons who need to access their own AWS account
| Group | A collection of people that require access to the same services/ resources
| Role | A temporary identity to assume to gain temporary access - it is best used for assigning fine-grained permissions, like accessing data in an S3 bucket
| Policy | A JSON document that allows or denies permission - can be used to define the level of access to a resource (i.e. only allowing access to a single bucket in S3)

AWS also offers Secrets Manager, a service to manage credentials and API keys, and Systems Manager, which provides a centralised view of all nodes across an AWS account.

*AWS also allows companies using an external identity provider like Active Directory to sign into the Management Console using their corporate credentials via the identity federation process.

### Protecting Networks and Apps

Networks and apps can have denial of service (Dos) attacks. A DoS attack occurs when a web app is flooded with excessive network traffic - actual customer requests are denied as the app becomes overloaded. Distributed DoS attacks (DDoS) are when multiple infected computers send excessive traffic to a web app.

AWS automatically protects against DDoS attacks through the use of **security groups** to only allow proper request into networks, **Elastic Load Balancing (ELB)** to handle traffic before handing it off to apps, and through the sheer amount of **regions** making it difficult for attacks to overwhelm services.

AWS offers services to protect network and apps:

| Service | Description
| - | -
| Shield Standard | Protects AWS customers from the most common types of DDoS attacks for free
| Shield Advanced | Paid version of Shield that mitigates more complex DDoS attacks
| WAF | Web application firewall that monitors network requests into web apps

*The WAF (not to be confused with the Well-Architected Framework) can be deployed on internet traffic services like CloudFront distrbutions and an Application Load Balancer to monitor the traffic coming in via the services

### Protecting Data

Data must be encrypted to be protected. For example, a user profile is encyrpted by turning its not-in-use information into a randomised set of characters. It is then decrypted when access is granted when in use. Access is determined through a lock and key, where an encryption and decryption key are used.

AWS allows customers to protect data through S3, where new buckets can encrypt uploaded objects, EBS, which encrypts EBS volumes and snapshots, and DynamoDB, where table data is encrypted using encryption keys stored in AWS Key Management Service (KMS).

Other services like Amazon Macie can be used to monitor data at rest using ML (like data within an S3 bucket), while AWS Certificate Manager (ACM) centralises the management of SSL/TLS (encryption) certificates for data encryption in transit.

### Security Incidents

AWS offers different services to prevent and protect against security incidents:

| Service | Description
| - | -
| Inspector | Scans AWS resources like EC2 instances for security vulnerabilities and provides insights to fix or remediate them - these findings can also be retrieved via an API
| GuardDuty | Monitors streams of account metadata to identify any threats like known malicious IP addresses, also providing steps for remediation
| Detective | Investigates the root cause of a threat after it has been detected and shows interactive visualisations of security data
| Security Hub | Centralises the other security services (and more) into a single place for management and visualisation

## Module 10: Monitoring, Compliance, and Governance

### Monitoring

AWS resources should be monitored to observe and analyse activity and potential threats. AWS offers CloudWatch as a service that monitors AWS resources and apps. It provides metrics, alarms, and logs within a centralised dashboard to watch over everything.

### Auditing

AWS resources should also be audited to check what changes occur and when and where they occur. As every action in AWS is an API call, they can be logged in a service like CloudTrail. CloudTrail can store log files in S3 and can also validate the integrity of the files to check for tampering.

### Compliance

Different regions in the world will have different compliance requirements for organisations. AWS offers different services to help meet compliance needs, such as Artifact, which provides a no-cost, on-demand access to AWS security agreements and compliance reports.

Artifact contains two types of reports: **agreements**, which companies can use to sign an agreement with AWS on the type of info used, and **reports**, which provide up-to-date compliance info from third-party auditors. AWS also has a compliance portal that contains resources to learn more about AWS compliance.

### Auditing Resources for Compliance

There are ways to configure AWS resources in order to meet a company's guidelines. AWS Config is a service that allows customers to assess, audit, and evaluate the configurations of all AWS resources in use. AWS Audit Manager is a service that continually audits AWS usage and collects evidence for compliance.

### AWS Organisations

As companies grow, more AWS accounts are usually made for different purposes like production, development, etc. AWS Organisations is a service that allows customers to centrally manage policies for groups of accounts and automate account creation.

Each Organisation is a collection of AWS accounts within a hierarchical tree structure, with each branch of the tree being an organisational unit (OU) of member accounts. A service control policy (SCP) controls the services and resources an organisational unit and its members, or individual members can access.

### Governance

AWS offers services that can help govern and enforce services and accounts to meet requirements.

AWS Control Tower allows customers to deploy compliant AWS accounts. A dashboard view is provided, and an account factory can standardise the provisioning of new accounts. Controls or guardrails can also be put in place to enforce governance, and a landing zone is used to set up a multi-account architecture.

AWS Service Catalog provides a curated catalog of AWS resources that can be deployed for new accounts. It helps administrators keep track of new employee requests for AWS services. For example, an account that needs access to a database can make a request through the Service Catalog.

Moving from on-premises to the cloud also involves handling software licenses. AWS License Manager helps to manage software licenses and fine-tune costs. For example, it can be used to automate the distribution and activation of software licenses for created AWS accounts.

### AWS Health

AWS Health provides data for events and changes that affect the health of resources. For example, a resource that is overloading will appear in the Health dashboard with remedy and guidance options. This data can also be retrieved programmatically using an API.

The Service Health Dashboard provides a general overview of the health and status of all AWS services used across all regions, while the Personal Health Dashboard provides a personalised view for specific resources and sends alerts and remediation guidance.

### AWS Trusted Advisor

AWS Trusted Advisor provides recommendations to optimise the cost, efficiency, and security of AWS resources. It continuously evaluates the AWS environment and gives advice for when something like an EC2 instance needs to be changed to reduce cost or improve security.

IAM Access Analyser helps to check the fine-grained permissions of IAM resources like users and roles. It provides reviews of said resources and can be used to set more fine-grained permissions that match corporate security standards.

## Module 11: Pricing and Support

### Pricing Concepts

AWS offers different pricing plans for customers:

- Pay as you go, where costs depend on the changing business needs
- Save when you commit, where services are offered in time-based plans (i.e. 1 year or 3 years)
- Pay less by using more, where some services decrease the unit cost when more resources are used

Pricing is also different for differnt types of services, such as:

- Compute, where payment is made by the hour or by the second
- Storage, where the type of storage and how frequently the storage is accessed affects cost
- Data transfer, where outbound data transfer is aggregated and charged at a certain rate

### Billing Options

AWS offers services to track pricing and billing.

| Service | Description
| - | -
| Organisations | Used to consolidate billing for multiple accounts with a single payment method
| Billing and Cost Management Dashboard | Centralises cost management, manage payment methods
| Budgets | Set custom budgets and send alerts when coverage starts to exceed thresholds
| Cost Explorer | Visualise and analyse costs and usage, with Reserved Instance recommendations
| Pricing Calculator | Planning tool to create estimates based on the type of resources used

### Support Plans

AWS has various support plans that allow customers to seek technical advice and support. Each plan includes some level of Trusted Advisor checks for security. Response times slowly get faster as each plan builds on the previous, and Technical Account Management is included in the Enterprise plans. However, all plans include 24 hour access to customer support.

| Plan | Description | Response Time
| - | - | -
| Basic | Only provides support for non-technical issues (i.e. increasing service quotas)
| Developer | Allows email creation of support tickets but no phone support | < 24 hours for general guidance<br>< 12 hours when systems down
| Business | Minimum recommended plan for support<br>Offers technical support through phone calls | < 4 hours when production system impaired<br>< 1 hour when production system is down
| Enterprise On-Ramp | Precursor to Enterprise plan with slightly less benefits | < 30 minutes when business-critical system is down
| Enterprise | Provides phone support for business-critical organisations | < 15 minutes when business- or mission-critical system is down

AWS also provides access to additional support services:

| Service | Description
| - | -
| re:Post | QnA platform for users to seek help on AWS problems and gain knowledge
| Trust and Safety Center | Provides info on how to report activity on AWS that may be abusive
| Solutions Architects | AWS specialists who provide support for those on Business and Enterprise plans
| Professional Services | Consulting service that offers deeper, project-based support
| Self-support | Includes documentation, user guides, SDK guides, blog posts, and whitepapers

### Marketplace and Partners

AWS Marketplace is a digital catalog for software listings from vendors. This software can be bought and tested on AWS, and includes Software as a Service (SaaS), ML and AI, and data and analytics tools. For example, a healthcare company can purchase a pre-built ML model to analyse medical history.

The AWS Partner Network is a global community for using AWS technologies to build solutions. For example, a business could seek an AWS Partner out for help in consulting/ development. Becoming an AWS partner also has benefits like funding, entrance to events and workshops, training and certification, etc.

### Cost Optimisation

Aside from checking for unused resources and the types of services used, AWS costs can be optimised by altering different parts of a customer's architecture. For example, a customer who has a VPC can use spot instances, auto scaling for said instances, and the right type of storage class.

## Module 12: Migrating to AWS

### Migration Phase

There are three phases in migrating to AWS. 

1. Assess business cases for the migration and the readiness of doing so - the AWS Migration Evaluator service can be used for this
2. Mobilise the resources needed for the migration using AWS Application Discovery Service and the Migration Hub
3. Migrate using AWS Application Migration Service for lift-and-shift and Database Migration Service (DMS) if only data is transferred - if data is transferred, AWS also has transfer services like DataSync, Transfer Family, and Snow Family

### Cloud Adoption Framework (CAF)

The CAF outlines the best practices for companies preparing to migrate to AWS. It includes different perspectives and tools to help with the migraton, where a developer perspective will differ from a business analyst's, and how legacy infrastructure can be migrated.

The six perspectives of CAF are:

1. Business: ensures that IT aligns with business needs
2. People: supports the human resource aspect of the adoption
3. Governance: ensures that business in the cloud is compliant with governance
4. Platform: principles for implementing cloud architecture
5. Security: ensures organisation meets security objectives
6. Operations: defines how day-to-day operations are conducted

### Migration Strategies

There are seven strategies for migrating to AWS:

1. Relocate by changing the hosting location to the cloud - can be done if on-premises apps are already run in VMs
2. Rehost by lifting and shifting the apps to the cloud without making changes
3. Replatform (lift, tinker, and shift) involves making a few cloud changes without changing the core architecture of the app
4. Refactor or re-architect the app by using features built for the cloud
5. Repurchase by moving from a traditional license to an SaaS model
6. Retain apps that are critical for the business in the on-premises environment first
7. Retire apps that would no longer be needed in the cloud

### Services and Tools

In the assess phase of the migration process, the Migration Evaluator helps to create business cases for the migration. It analyses current state and target state of the migration using data and includes a total estimated/ projected cost.

The mobilise phase can be performed using the Application Discovery Service, which discovers on-premises connections between servers and databases, and the Migration Hub, which is a centralised hub that shows the tools, guidance, and automated recommendations for the migration.

To migrate and modernise, the Application Migration Service can be used to migrate from any source infrastructure that runs a supported OS, or to modernise the on-premises apps running on physical servers.

### Database Migrations

The AWS DMS helps to migrate on-premises databases to the cloud quickly. The process also maintains high availability and low downtime for the database and supports homogenous (same database providers) and heterogenous (different database providers) migrations.

Changing from a commercial database to an open source datbase involves logistics. Databases have different source and target engines and need to be recreated when moved. AWS Schema Conversion Tool (SCT) helps to convert objects in one format to another.

### Transferring Data Online

The DMS migrates a database and the data that is contained within it. Other services deal with the data and the implications of moving it online to the cloud.

DataSync accelerates data transfer by automating running instances, encryption, and network optimisation of the data. For example, large amounts of data can be moved from on-premises to S3. It also manages the transfer process by ensuring security, data validation, and scheduling.

Transfer Family supports file transfers into and out of S3. It supports different transfer protocols, like FTP, SFTP, or FTPS. Direct Connect establishes a dedicated private connection between an on-premises network and a VPC in AWS to securely transfer data.

### Transferring Data Offline

Offline migrations are when data needs to be transferred offline - this may be the case when bandwidth is limited in remote locations with no internet or when Direct Connect cannot be used. AWS Snowball Edge Storage Optimised devices are physical devices that have high performance data transfer. 

## Module 13: Well-Architected Solutions

### AWS Specialised Services

AWS offers services for specific use cases. These services can be split into different categories:

#### Development

Development services help developers with their work. CodeBuild is a service that compiles code and runs tests, like in the building process of development. CodePipeline is a fully managed service that automates the build, test and deployment of a product, like in a CI/CD pipeline.

Other development services include X-Ray, which helps developers find bugs like bottlenecks in their apps, AppSync, which allows developers to create a single GraphQL API that connects frontend apps to backend data, and Amplify, which allows features like authentication and storage to be added to apps.

#### Business Application

Business application services help to manage customer service operations and email promotions. Amazon Connect is a customer service call center that routes, records, and analyses calls, while SES (Simple Email Service) is an email service provider that can be integrated into other apps for email notifications.

#### End-user Computing

End-user computing services are for connecting business employees to IT departments, like through providing remote access to virtual desktops and apps. AppStream 2.0 streams apps from the AWS cloud to any compatible device - good for providing access to powerful software without needing the hardware required.

WorkSpaces allows employees to access their work environment, akin to their physical office computer, from any device with an internet connection while WorkSpaces Secure Browser is the equivalent but for private websites and apps - IT departments do not need to manage specialised client software this way.

#### Internet of Things (IoT)

IoT is a network of connected physical devices that collect and exchange data over the internet. IoT services like Iot Core help to manage this network by securing the connections with authentication. An example is security cameras that send alerts to a phone (transforming real-world data into virtual).

### Well-Architected Framework (WAF)

The WAF is a set of principles that guides the optimised use of AWS for a business, and has six pillars:

- Operational Excellence
- Security
- Reliability
- Performance Efficiency
- Cost optimisation
- Sustainability

AWS also offers a Well-Architected Tool service that helps to assess and improve cloud workloads based on the WAF.

# Exam Review

## Domain 1 - Cloud Concepts



## Domain 2 - Security and Compliance



## Domain 3 - Cloud Technology and Services



## Domain 4 - Billing, Pricing, and Support



## AWS Services

| Service | Description
| - | -
| Trusted Advisor | Identifies security groups that allow unrestricted access to a customer's AWS resources (checks security groups for rules that allow unrestricted access to prevent malicious activity)
| Identity Access and Management (IAM) | Manages permissions that control which AWS resources customers can access
| CloudWatch | Monitors and collects metrics for AWS resources
| CloudTrail | Provides an audit record for API calls made to AWS resources
| S3 | A durable object storage service that stores objects in the cloud
| Lambda | Event-driven service that allows customers to run code in functions without managing a server (serverless)
| Certificate Manager | Creates, stores, and renews security certificates - can be used to encrypt resources that are in transit from one storage to another
| Resource Access Manager (RAM) | Shares resources across AWS accounts
| Shield | Protects against DDoS attacks
| Security Hub | Checks a customer's AWS environment against security industry standards and best practices
| Global Accelerator | Networking service that improves network traffic performance of customers of AWS hosted applications
| DynamoDB | A not-only SQL (NoSQL) database
| Aurora | A relational database compatible with MySQL and PostgreSQL for the cloud - can be used to automatically record data entries from websites and services
| Elastic Block Store (EBS) | A block-storage service that is not a relational database on its own, but can hold the storage used for databases run on other services (i.e. EC2 instances)
| Inspector | Automatically detects security vulnerabilities/ CVEs in EC2 instances or ECR repositories
| Macie | Automated security assessment service that can discover, classify, and protect data across various AWS resources (i.e. like an S3 bucket)
| GuardDuty | Monitors AWS accounts for malicious activity
| Secrets Manager | Protects secrets needed to access applications and services in an AWS account
| Client VPN | VPN service that provides secure access to AWS resources within a company's on-premises network
| Connect | Cloud contact center that helps companies provide customer services to others
| Direct Connect | Links an internal network to the AWS Cloud through an ethernet cable (consistent and private connection since the cable is only used by one customer)
| Site-to-Site VPN | Creates an encrypted network path between an on-premises data center to the AWS Cloud - this uses internet and is not consistent
| CloudFront | Web service that speeds up the display of web content to a company's customers - does not provide a network connection but selects edge locations with the lowest latency
| Elastic Beanstalk | Deploys web applications on automatically deployed infrastructure
| DynamoDB Accelerator (DAX) | Reduces response times from a DynamoDB table
| Route 53 | DNS web service that helps to route traffic to and from resources - can reduce latency if more than one route is involved
| EventBridge | Serverless event bus that connects multiple applications together through a data stream
| Simple Queue Service (SQS) | Decouples applications from systems by hosting a queue for requests that are sent from system to application
| Simple Notification Service (SNS) | Delivers publications to subscribers - can be used to send notifications to customers when an event occurs (i.e. a test fails in an application)
| Comprehend | Natural language processing (NLP) service that uses ML to find insights in text
| Elastic Load Balancing | Accepts incoming traffic and routes the request to a target in an availability zone, but does not cross regions
| Cloud Map | Creates and maintains a map of backend services
| Organisations | Centralised service that provides governance and billing for an AWS environment - useful for companies that have multiple departments with individual AWS accounts
| Systems Manager OpsCenter | Provides a central location to view and investigate operational work items
| Database Migration Service (DMS) | Migrates data from an on-premise database to an AWS database, but not the actual database server
| Migration Hub | Plans and track application migrations but does not perform them
| Application Migration Service | Migrates physical servers and their databases/ applications to EC2 instances
| Application Discovery Service | Collects information about on-premise servers to help plan migrations but does not perform them
| Transcribe | Converts audio data to text
| Polly | Converts text data to audio
| Translate | Translates languages
| Textract | Extracts text from scanned documents

#### AWS Lambda

Once the free pricing tier for Lambda is exceeded, it charges customers according to:

- The amount of time it takes to run all Lambda functions in use
- By the number of request made for each Lambda function

### Other

An AWS account can be accessed through a program/ the command line using the following:

- Access key ID: a unique public identifier
- Secret access key: a private password given at the time of the account creation

<br>

Individual AWS accounts have their own Cost and Usage reports in the Billing and Cost Management console, but only for their own accounts

#### AWS Shared Responsibility Model

This model details the responsibilities of customers when using AWS services - some of the responsibilities are:

- Configuring IAM customers according to the principle of least privilege: an IAM customer has accesses that can be assigned
- Configuring S3 buckets to allow public access: the customer has to determine the access of their own S3 buckets, not AWS
