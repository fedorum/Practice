# Overview

The AWS Certified Cloud Practitioner (CCP) exam tests knowledge of the AWS Cloud and its services.

## What is AWS?

A cloud computing service provider.

AWS allows businesses of any size to replace capital infrastructure expenses like physical servers with the servers provided by AWS. This makes it quicker to deploy applications and for them to scale up as the business grows.

## AWS Well-Architected Framework

The Well-Architected Framework is a set of principles that guides the usage and operation of AWS for a business.

- Performance efficiency
- Reliability
- Cost optimisation
- Security

## Support Plans

AWS has various support plans that allow customers to seek technical advice and support.

| Plan | Description
| - | -
| Enterprise | Provides phone support for business-critical organisations
| Business | Minimum recommended plan for support<br>Offers technical support through phone calls
| Developer | Allows email creation of support tickets but no phone support
| Basic | Only provides support for non-technical issues (i.e. increasing service quotas)

<br>

# AWS Cloud Practitioner Essentials

## Module 1 - Introduction

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

## Module 2 - Compute in the Cloud

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

## Module 3 - Exploring Compute Services

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

## Module 4 - Going Global

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

## Module 5 - Networking

### Networking Services

AWS allows customers to isolate resources using a Virtual Private Cloud (VPC), preventing public access to them. Subnets are used to organise resources into publicly and privately accessible ones.

AWS architects infrastructure based on the region, AZs, and subnets within those AZs, which can reside within a VPC. If there are public subnets within a VPC, an internet gateway is provided for public access. 

## Organising AWS Cloud Resources

Amazon VPC provides an isolate section of the AWS cloud to organise resources. It increases security as connections can be monitored, gives full control over the resource placement, and saves time as it is quicker for VPC to set up and manage resources.

A VPN creates a secure connection tunnel through the internet. A Virtual Private Gateway allows this connection into a VPC, which can be used to access secure on-premises data or a corporate network. 

## Connecting to the AWS Cloud

A business using AWS may have its workers at different network locations - the main office, a data center, or working from home. AWS provides different types of VPNs for such accesses.

| VPN | Description
| - | -
| Client VPN | Connects remote workers and on-premises networks to AWS Cloud - a fully-managed and elastic service that provides authentication
| Site-to-Site VPN | Connects a private data center to AWS Cloud resources - used for application migration and communication between different locations
| PrivateLink | Connects a VPC to services as if they were within the VPC - simplifies connection as no internet gateway or other connections are needed
| Direct Connect | Establishes a dedicated private connection between a network and VPC within the AWS Cloud - food for latency-sensitive apps, large-scale data migration, and hybrid cloud architectures

## Subnets, Security Groups, and Network Access Control Lists (ACL)

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
