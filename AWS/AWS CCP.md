# AWS Certified Cloud Practitioner Notes

The AWS Certified Cloud Practitioner (CCP) exam tests knowledge of the AWS Cloud and its services.

The exam guide gives an overview of the content in the exam, technological concepts used, and the included/ excluded knowledge of AWS services.

The exam prep plan overview outlines the 4 steps to prepare for the exam.

The practice question set provides some questions that are found within the exam.

## AWS Services

### Security

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
| Client VPN | 

#### AWS Lambda 

Once the free pricing tier for Lambda is exceeded, it charges users according to:

- The amount of time it takes to run all Lambda functions in use
- By the number of request made for each Lambda function

### Other

AWS has various support plans that allow users to seek technical advice and support.

| Plan | Description
| - | -
| Enterprise | Provides phone support for business-critical organisations
| Business | Minimum recommended plan for support<br>Offers technical support through phone calls
| Developer | Allows email creation of support tickets but no phone support
| Basic | Only provides support for non-technical issues (i.e. increasing service quotas)


