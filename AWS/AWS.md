# Day 1

## Module 1 - Identity Access and Managements (IAM)

Principals
- Make request on AWS
- Can be person, application, user, or role

IAM Users
- Access key ID
- Secret access  key
*Store in csv for others' access

Security policy categories
- Permission boundaries limit user access to services
- Can write own policies for organisations

Policies have implicit denial of access

## Module 2 - Networking

IP addresses
- Changed
- AWS reserves 5 addresses for itself, others are usable

Virtual private cloud (VPC)
- Creating a block of availability zones within a region
- Requires a name, and a specified CIDR block (range of IP addresses used)
- Has an implicit router to allow things within it to communicate (cannot be deleted or altered)
    - Can add a route to the router to go to specfic services

Public subnet
- Access to and from the internet
- Place a web server within it

Private subnet
- Place a secure database within it

Network access control list (NACL)
- Firewall for subnets
- Allows all inbound and outbound traffic to the subnet by default
- Evaluates rules by the lowest number
- Stateless

Security groups
- Also a firewall for the subnets
- Allows all outbound traffic but blocks all inbound traffic
- Need rules to for inbound
- Stateful

Route tables allow access between CIDR blocks (different ip addresses)

## Module 3 - Lambda Function

Lambda - serverless function
- Uses micro virtual machine (firecracker) to run code
- The function contains code in any language
- AWS services can trigger lambda
Example: Configure permission policies to trigger lambda
-> handler function in code for function (runtime, layers)
-> configurations to speed up function

Invocation
- Synchronous vs asynchronous
- No option to queue
- Event source mapping (ESM) - poll-based, looks for changes

Handler function
- Takes in 2 parameters: info about event and context
- 

<br>

# Day 2

## Module 1 - DevOps

What is DevOps?

- Combination of development and operations
- Idea of creating infrastructure programmatically
- More about the philosophies and culture that allow fast changes
    - People over process and tools

## Module 2 - Docker

Containers have a server, OS, and shared/ separate libraries

Original containers were built from hypervisor-made virtual machines in an isolated environment

Docker
- Most prevalent and powerful runtime engine for containers

AWS Elastic Container Service (ECS)
- An ECS cluster contains multiple containers
- A service allows users to access individual containers within the cluster

AWS Elastic Kubernetes Service (EKS)
- An EKS node contains pods, which contain containers
- The control plane sends instructions to the nodes, which are in the worker plane

Workflow
- Pipeline connected to Elastic Container Registry (ECR) 
- 

## Module 3 - Data Analytics, S3

SDifferent types of storage exist

File storage
- Native file storage system in OS
- EFS/ FSX

Object storage
- AWS S3 service

Block storage
- SSD, 

AWS S3
- Stores data within objects, which are stored in buckets
- Does not have a hierarchical file structure
    - No bucket within a bucket BUT each bucket has a prefix
    - Is a pseudo file structure
- Can have different access types - public, private, controlled
- Can also make policies to limit control of the bucket (i.e. read, write, etc.)
- Different bucket types exist for different frequency of access
    - Save money depending on bucket used

By default, versioning is not enabled for an S3 buckets

Data in S3 is shifted automatically by AWS
- Policies can also be written to specify the data shift
- 

## Workshop

Amazon ECS allows continuous deployment for an application
- The ECS service cluster can run tasks that update an application (i.e. ui)
- When a task is run, it 'slowly' updates the application by serving the old and new versions over a period of time
- A load balancer distributes traffic to the old and new versions equally, causing users to interact with seemingly inconsistent apps
- The task gradually transitions the app to the new version after awhile
