I. Contents
========
**1. Executive Summary**
- Overall summary of what the application is and does

**2. Context of Creation**
- Contributors and purpose

**3. Current Situation Assessment**
- Applications similar to ours that are currently available

**4. Requirements Definition**
- Requirements that our product must fulfill

**5. Concept**
- In depth description of how the application operates

**6. Proof Of Concept**
- Item by item proof of concepts detailed in section 4

**7. Notes**
- Details on current implementation, additions for future implementation, etc

II. Report
========
####1. Executive Summary
  
Inspired by the Greek God of running, Atalanta is an Android application that tracks users' achievements and rewards them upon achieving milestones by automatically ordering physical products from Amazon. The application is designed to be simple and intuitive.

Users contribute funds for use by their account, for which they may define milestones upon which specified items from Amazon will be automatically ordered to be delivered to their doorstep. Users may also gift funds to other users, for which the gifter may specify the gift items and milestone upon which the gift will be achieved.

####2. Context of Creation

**Created**
- November 22-23 of 2014

**Original Purpose**
- WildHacks 2014 at Northwestern University

**Contributors**
- Sam Cohen, Stan Huang, Sophia Lou, Edwin Wu, Wayne Xun

####3. Current Situation Assessment

Fitness is a strong interest of many individuals with electronic devices. There are many applications that seek to heighten users' motivation and drive to complement their fitness experience with their electronic device. Most of these applications do so by providing information to allow users to plan and/or monitor their fitness activities and history.

There is also a smaller group of applications that seek to intensifify users' motivation and drive to engage in fitness related activites. They achieve this by "gamifying" the experience, or enhancing the experience with an added virtual work and reward system, as well as socially sharing fitness activity amongst other techniques.

Online shopping is also a strong interest of many individuals with electronic devices. Applications that seek to make the online shopping experience easily accessible and the data easily dissectable are becoming more and more sophisticated and readily available.

####4. Requirements Definition

Our team seeks to design a product that allows the user to implement their Android device to enhance their sometimes abstract fitness experience with the gratification of gaining physical rewards in a social application that is easy to use.

####5. Concept

Atalanta is an Android application that allows users to enhance their fitness experience by supplementing their sometimes intangible history of exercise with physical rewards upon achieving certain milestones. Users contribute funds to their account via Paypal which will be used to fund rewards from Amazon. Upon contributing funds users may set their milestones upon which rewards will be granted, and select rewards from Amazon which they would like. Users may also contribute funds to friends accounts, and will then define milestones and rewards in the same fashion.

**Components**

Users' devices
- Allows users to interact with Atalanta services

PayPal
- Securely transfers users' funds

Atalanta web server
- Allows scheduling and implementation of services to be carried out securely

Zinc API
- Purchases items automatically from Amazon

**Setup**

Upon first initialization of the Atalanta after installation, Atalanta prompts user to create an Atalanta account and provide necessary information. User will input: phone number, password, full name, shipping address, credit card information, and billing address (note 1).

**Tracking Data**

Atalanta tracks and progress data to users by tracking their location using Android's integrated tools which implement the device accelerometer, GPS, and WiFi connections. Items tracked include trip distance, current speed, and elapsed time. Items calculated and known include net distance, average trip distance, average trip speed, overall trip speed, net elapsed time, and average trip time.

**Displaying Data**

Tracked items and known items are available to the user in the information display screen. Here, users view both tracked and known items, but also listing of goals and distance until next goal.

**Contributing Funds**

Opening the menu allows users to contribute funds. User will select to contribute funds to own account, or to external account. If user contributes to an external account, he/she is prompted to enter the phone number of the associated account (note 2). The remainder of the process is identical for own or external account.

Once own/external account is selected, user enters credit card information and contribution amount. This information is validated by PayPal, and if approved transfers funds to Atalanta's PayPal account (note 3). User has the option to allow Atalanta to "remember me" for future transactions (note 4). User fund amount and earmark are stored on Atalanta web server (note 5).

**Defining Milestones and Rewards**

After user succesfully contributes funds, user inputs milestones. Milestones occur when a certain distance has been traversed. User then inputs either Amazon item ID or wish list ID to select item and item color/size/attributes.

**Automatic Reward Purchasing**

When user finishes a run, if net distance traversed meets or exceeds an unrewarded milestone, Atalanta automatically submits an order for the corresponding reward item from Amazon.

Reward purchasing begins at the end of a run with user's device sending a packet to Atalanta web server. The web server carries out web service by ordering the appropriate award based on stored data for the user. Ordering is submitted through Zinc API. Zinc API accepts funds previously contributed by users to user's Atalanta account. Zinc API accesses these funds through Atalanta secure purchasing credit card.

Atalanta will appropriately notify user of issue if an error occurs. Errors occur when reward item value exceeds that of applicable funds in user's account, there is a connectivity issue, Atalanta server fails to respond to user reward request, Zinc server fails to respond to Atalanta web server request, etc.

####6. Proof Of Concept

*6. Proof of Concept* lists capabilites specified by *5. Concept* and illustrates an action that the POC performs which illustrates the listed capability.

Largest burden of POC rests on capability to send and receive payments, and utilize PayPal and Zinc APIs to automate reward item ordering.

**Setup**
- Concept receives and stores user information
POC receives user data and visibily stores them locally and on Atalanta server.

**Tracking Data**
- Concept obtains and analyzes data
Existing available applications perform such instances of basic functionality.

**Displaying Data**
- Concept displays saved data
Existing available applications perform such instances of basic functionality.

**Contributing Funds**
- Concept uses PayPal transaction services
POC sends PayPal funds to own account

- Concept stores and uses PayPal card ID
POC uses PayPal API to obtain and visibly store PayPal card ID on Atalanta server

**Defining Milestones and Rewards**

- Concept compares stored data
Existing available applications perform such instances of basic functionality.

**Automatic Reward Purchasing**

- Concept, when triggered, executes functions
POC executes corresponding functions when triggered

- Concept uses Zinc API to order Amazon items
POC sends request to Zinc API using test userid "public" to illustrate Zinc API functionality


####7. Notes

**(note 1)**  | Will implement Facebook account integration in the future

**(note 2)**  | Will implement Facebook friend search in the future

**(note 3)**  | PayPal is chosen for this step for security purposes

**(note 4)**  | "Remember me" is securely implemented by storing PayPal card ID, which can only be used to transfer funds to Atalanta PayPal account

**(note 5)**  | Fund information storage security will be implemented in the future by guarding against top threats as listed by OWASP.ORG

III. Disclaimer
========

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
