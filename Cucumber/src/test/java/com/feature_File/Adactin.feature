Feature: Hotel Bokking In Adactin Application
@AD1
Scenario Outline: Login
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Cllick On Login Button And It Navigate To Search Hotel Page
Examples:
        |Username|Password|
        |vikey|vk@1|
        |vkj|vh@2|
        |vikneshkumar|VCVM24|
@AD2
Scenario: Search Hotel
When user Select The Location 
And user Select The Hotel
And user Select The Room Type
And user Select The  Number Of Rooms
And user Enter The CheckInDate 
And user Enter The CheckOutDate 
And user Select Adults Per Room
And user Select The Childrens Per Room
Then user Click To Search Button And It Navigate To Select Hotel Page 
@AD3
Scenario: Select Hotel
When user Select The Radio Button 
Then user Click The Continue Button And It Navigate To Book A Hotel Page 
@AD4
Scenario: Book A Hotel
When user Enter The First Name 
And user Enter The Last Name 
And user Enter The BillingAddress 
And user Enter The Credit Card Number 
And user Select The Credit Card Type
And user Select The Expiry Date On Select Month 
And user Select The Expiry Date On Select Year
And user Enter The Cvv Number 
Then user Click The Book Now Button And It Navigate To Hotel Booking Confirmation Page
@AD5
Scenario: Logout
Then user Click The Logout Button 
