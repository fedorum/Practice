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


