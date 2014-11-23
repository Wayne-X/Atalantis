I. Contents
========
1. Executive Summary
>Overall summary of what the application is and does

2. Context of Creation
>Contributors and purpose

3. Current Situation Assessment
>Applications similar to ours that are currently available

4. Requirements Definition
>Requirements that our offering must fulfill

5. Concept
>In depth description of how the application operates

6. Proof Of Concept
>Item by item proof of concepts detailed in section 4

7. Notes
> Details on current implementation, additions for future implementation, etc

II. Report
========

####1. Executive Summary
  
Inspired by the Greek God of running, Atalanta is an Android application that tracks users' achievements and rewards them upon achieving milestones by automatically ordering physical products from Amazon. The application is designed to be simple and intuitive.

Users contribute funds for use by their account, for which they may define milestones upon which specified items from Amazon will be automatically ordered to be delivered to their doorstep. Users may also gift funds to other users, for which the gifter may specify the gift items and milestone upon which the gift will be achieved.

####2. Context of Creation

Created: November 22-23 of 2014

Original Purpose: WildHacks 2014 at Northwestern University

Contributors: Sam Cohen, Stan Huang, Sophia Lou, Edwin Wu, Wayne Xun

####3. Current Situation Assessment

Fitness is a strong interest of many individuals with electronic devices. There are many applications that seek to heighten users' motivation and drive to complement their fitness experience with their electronic device. Most of these applications do so by providing information to allow users to plan and/or monitor their fitness activities and history.

There is also a smaller group of applications that seek to intensifify users' motivation and drive to engage in fitness related activites. They achieve this by "gamifying" the experience, or enhancing the experience with an added virtual work and reward system, as well as socially sharing fitness activity amongst other techniques.

Online shopping is also a strong interest of many individuals with electronic devices. Applications that seek to make the online shopping experience easily accessible and the data easily dissectable are becoming more and more sophisticated and readily available.

####4. Requirements Definition

Our team seeks to design a product that allows the user to implement their Android device to enhance their sometimes abstract fitness experience with the gratification of gaining physical rewards in a social application that is easy to use.

####5. Concept

Atalanta is an Android application that allows users to enhance their fitness experience by supplementing their sometimes intangible history of exercise with physical rewards upon achieving certain milestones. Users contribute funds to their account via Paypal which will be used to fund rewards from Amazon. Upon contributing funds users may set their milestones upon which rewards will be granted, and select rewards from Amazon which they would like. Users may also contribute funds to friends accounts, and will then define milestones and rewards in the same fashion.

**Components**

Users' devices: allows users to interact with Atalanta services

PayPal: securely transfers users' funds

Atalanta web server: serves as an intermediate to allow scheduling and implementation of services to be carried out securely

Zinc API: purchases items automatically from Amazon

**Setup**

Upon first initialization of the Atalanta after installation, user will be prompted to enter their login information, including

####6. Proof Of Concept

####7. Notes

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
