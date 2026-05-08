# AWS Certified Cloud Practitioner Notes

The AWS Certified Cloud Practitioner (CCP) exam tests knowledge of the AWS Cloud and its services.

The exam guide gives an overview of the content in the exam, technological concepts used, and the included/ excluded knowledge of AWS services.

The exam prep plan overview outlines the 4 steps to prepare for the exam.

The practice question set provides some questions that are found within the exam.

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

#### AWS Lambda

Once the free pricing tier for Lambda is exceeded, it charges users according to:

- The amount of time it takes to run all Lambda functions in use
- By the number of request made for each Lambda function

#### Amazon EC2

Amazon EC2 allows users to purchase unused capacity via services known as 'instances':

| Instance | Description
| - | -
| Reserved | Reserve some capacity for usage, sometimes at a discounted rate
| On-Demand | Offers immediately available capacity when purchased (not discounted)
| Dedicated | Run in VPCs dedicated to a single user, used when there are licensing and compliance constraints (not discounted)
| Spot | Offers users unused EC2 capacity, often at a discounted rate

### Other

AWS has various support plans that allow users to seek technical advice and support.

| Plan | Description
| - | -
| Enterprise | Provides phone support for business-critical organisations
| Business | Minimum recommended plan for support<br>Offers technical support through phone calls
| Developer | Allows email creation of support tickets but no phone support
| Basic | Only provides support for non-technical issues (i.e. increasing service quotas)

<br>

An AWS account can be accessed through a program/ the command line using the following:

- Access key ID: a unique public identifier
- Secret access key: a private password given at the time of the account creation

<br>

AWS provides various availability zones to deploy applications and the associated AWS resources in. Deploying an application in multiple availability zones **prevents a single point of failure** and **increases application availability** - if a problem occurs in one availability zone, the others are not affected
