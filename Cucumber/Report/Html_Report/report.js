$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature_File/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Bokking In Adactin Application",
  "description": "",
  "id": "hotel-bokking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AD1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Cllick On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9,
      "id": "hotel-bokking-in-adactin-application;login;;1"
    },
    {
      "cells": [
        "vikey",
        "vk@1"
      ],
      "line": 10,
      "id": "hotel-bokking-in-adactin-application;login;;2"
    },
    {
      "cells": [
        "vkj",
        "vh@2"
      ],
      "line": 11,
      "id": "hotel-bokking-in-adactin-application;login;;3"
    },
    {
      "cells": [
        "vikneshkumar",
        "VCVM24"
      ],
      "line": 12,
      "id": "hotel-bokking-in-adactin-application;login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Login",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AD1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"vikey\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"vk@1\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Cllick On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_SD.user_Launch_The_Application()"
});
formatter.result({
  "duration": 3521045053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vikey",
      "offset": 16
    }
  ],
  "location": "Adactin_SD.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 407039812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vk@1",
      "offset": 16
    }
  ],
  "location": "Adactin_SD.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 176594495,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Cllick_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 564739650,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AD1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"vkj\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"vh@2\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Cllick On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_SD.user_Launch_The_Application()"
});
formatter.result({
  "duration": 407130227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vkj",
      "offset": 16
    }
  ],
  "location": "Adactin_SD.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 172293213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vh@2",
      "offset": 16
    }
  ],
  "location": "Adactin_SD.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 182052593,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Cllick_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 479132842,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AD1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"vikneshkumar\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"VCVM24\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Cllick On Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_SD.user_Launch_The_Application()"
});
formatter.result({
  "duration": 385168811,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vikneshkumar",
      "offset": 16
    }
  ],
  "location": "Adactin_SD.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 216306947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VCVM24",
      "offset": 16
    }
  ],
  "location": "Adactin_SD.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 198224555,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Cllick_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 968468341,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@AD2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The  Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter The CheckInDate",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter The CheckOutDate",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Childrens Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click To Search Button And It Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Location()"
});
formatter.result({
  "duration": 288291480,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 248712450,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 234750510,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 232056650,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Enter_The_CheckInDate()"
});
formatter.result({
  "duration": 169250401,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Enter_The_CheckOutDate()"
});
formatter.result({
  "duration": 170495188,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_Adults_Per_Room()"
});
formatter.result({
  "duration": 208490255,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Childrens_Per_Room()"
});
formatter.result({
  "duration": 231774654,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Click_To_Search_Button_And_It_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 761933969,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@AD3"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user Select The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user Click The Continue Button And It Navigate To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Radio_Button()"
});
formatter.result({
  "duration": 299214519,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Click_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 785751568,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Book A Hotel",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@AD4"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Enter The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter The BillingAddress",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The Expiry Date On Select Month",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The Expiry Date On Select Year",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Click The Book Now Button And It Navigate To Hotel Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_SD.user_Enter_The_First_Name()"
});
formatter.result({
  "duration": 269620660,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Enter_The_Last_Name()"
});
formatter.result({
  "duration": 263057063,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Enter_The_BillingAddress()"
});
formatter.result({
  "duration": 264492453,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 213031014,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 217628464,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Expiry_Date_On_Select_Month()"
});
formatter.result({
  "duration": 219059455,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Select_The_Expiry_Date_On_Select_Year()"
});
formatter.result({
  "duration": 219500287,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Enter_The_Cvv_Number()"
});
formatter.result({
  "duration": 196216376,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_SD.user_Click_The_Book_Now_Button_And_It_Navigate_To_Hotel_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 135492103,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Logout",
  "description": "",
  "id": "hotel-bokking-in-adactin-application;logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@AD5"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "user Click The Logout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_SD.user_Click_The_Logout_Button()"
});
formatter.result({
  "duration": 6347553973,
  "status": "passed"
});
});