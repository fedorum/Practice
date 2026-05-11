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

AWS has various support plans that allow users to seek technical advice and support.

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

### Amazon EC2

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

# Exam Review

## Domain 1 - Cloud Concepts



## Domain 2 - Security and Compliance



## Domain 3 - Cloud Technology and Services



## Domain 4 - Billing, Pricing, and Support



## AWS Services

| Service | Description
| - | -
| Trusted Advisor | Identifies security groups that allow unrestricted access to a user's AWS resources (checks security groups for rules that allow unrestricted access to prevent malicious activity)
| Identity Access and Management (IAM) | Manages permissions that control which AWS resources users can access
| CloudWatch | Monitors and collects metrics for AWS resources
| CloudTrail | Provides an audit record for API calls made to AWS resources
| S3 | A durable object storage service that stores objects in the cloud
| Lambda | Event-driven service that allows users to run code in functions without managing a server (serverless)
| Certificate Manager | Creates, stores, and renews security certificates - can be used to encrypt resources that are in transit from one storage to another
| Resource Access Manager (RAM) | Shares resources across AWS accounts
| Shield | Protects against DDoS attacks
| Security Hub | Checks a user's AWS environment against security industry standards and best practices
| Global Accelerator | Networking service that improves network traffic performance of users of AWS hosted applications
| DynamoDB | A not-only SQL (NoSQL) database
| Aurora | A relational database compatible with MySQL and PostgreSQL for the cloud - can be used to automatically record data entries from websites and services
| Elastic Block Store (EBS) | A block-storage service that is not a relational database on its own, but can hold the storage used for databases run on other services (i.e. EC2 instances)
| Inspector | Automatically detects security vulnerabilities/ CVEs in EC2 instances or ECR repositories
| Macie | Automated security assessment service that can discover, classify, and protect data across various AWS resources (i.e. like an S3 bucket)
| GuardDuty | Monitors AWS accounts for malicious activity
| Secrets Manager | Protects secrets needed to access applications and services in an AWS account
| Client VPN | VPN service that provides secure access to AWS resources within a company's on-premises network
| Connect | Cloud contact center that helps companies provide customer services to others
| Direct Connect | Links an internal network to the AWS Cloud through an ethernet cable (consistent and private connection since the cable is only used by one user)
| Site-to-Site VPN | Creates an encrypted network path between an on-premises data center to the AWS Cloud - this uses internet and is not consistent
| CloudFront | Web service that speeds up the display of web content to a company's users - does not provide a network connection but selects edge locations with the lowest latency
| Elastic Beanstalk | Deploys web applications on automatically deployed infrastructure
| DynamoDB Accelerator (DAX) | Reduces response times from a DynamoDB table
| Route 53 | DNS web service that helps to route traffic to and from resources - can reduce latency if more than one route is involved
| EventBridge | Serverless event bus that connects multiple applications together through a data stream
| Simple Queue Service (SQS) | Decouples applications from systems by hosting a queue for requests that are sent from system to application
| Simple Notification Service (SNS) | Delivers publications to subscribers - can be used to send notifications to users when an event occurs (i.e. a test fails in an application)
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

Once the free pricing tier for Lambda is exceeded, it charges users according to:

- The amount of time it takes to run all Lambda functions in use
- By the number of request made for each Lambda function

#### AWS EC2

AWS EC2 allows users to purchase unused capacity via services known as 'instances':

| Instance | Description
| - | -
| Reserved | Reserve some capacity for usage, sometimes at a discounted rate
| On-Demand | Offers immediately available capacity when purchased (not discounted)
| Dedicated | Run in VPCs dedicated to a single user, used when there are licensing and compliance constraints (not discounted)
| Spot | Offers users unused EC2 capacity, often at a discounted rate

### Other

An AWS account can be accessed through a program/ the command line using the following:

- Access key ID: a unique public identifier
- Secret access key: a private password given at the time of the account creation

<br>

AWS provides various availability zones to deploy applications and the associated AWS resources in. Deploying an application in multiple availability zones **prevents a single point of failure** and **increases application availability** - if a problem occurs in one availability zone, the others are not affected

This also **reduces latency** for the application's global performance, which can be done through `CloudFront` by deploying the application in **edge locations**

<br>

Individual AWS accounts have their own Cost and Usage reports in the Billing and Cost Management console, but only for their own accounts

#### AWS Shared Responsibility Model

This model details the responsibilities of users when using AWS services - some of the responsibilities are:

- Configuring IAM users according to the principle of least privilege: an IAM user has accesses that can be assigned
- Configuring S3 buckets to allow public access: the user has to determine the access of their own S3 buckets, not AWS
