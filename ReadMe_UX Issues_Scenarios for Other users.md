# Assignment
mytaxi QA Assignment

### Possible scenarios that should be tested if the app has various kind of users:
NOTE:  Users can be diffrentiated on basis of roles like drivers, customer, administrator etc or customers on the basis of personality like child user, tech savvy user, diffrently abled user etc.

### Scenarios when users are diffrentiated on basis of different roles(Common to all roles):-

1. It should be allowed to login as various kinds of users like drivers, customer, administrator etc.

2. Each user should be allowed to see only pages or allowed to perform activity for which he/she is entitled to.

3. Each user shouldnt be allowed to see each other data(security Testing)

### Scenarios as a driver:

1. Driver should be able to see which user has booked his/her cab, the trip details(pick up and drop location), and other necessary details.

2. Driver shouldnt be able to see the details which he should be allowed to see like user payment details and traveller detailed profile etc.

3. Driver should be able to charge the user with different ways(cards/cash etc) after the trip is completed.

4.Driver should be able to see his/her feedback by an anonymous customer and his collective ratings.

5. Driver should be able to see his/her last activity, daily activity, weekly or monthly as per app features.

6. Driver should be able to provide feedback of the customer in the app.

7. The app should be performance tested for not getting unresponsive at peak time.

8. Drivers should be able to retrieve the forgotten credentials or reset the credentials. 


### Scenarios as a Customer(including various kinds of customers):

1. The app should provide the option of login by using different langauges.

2. After logging in, the app contents should be shown in their chosen language

3. It should be possible to login using voice of user for people who doesnt know to type or have problem in typing.

4. It should be possible to login using user's social profile like gmail or facebook account or phone no for tech savvy people.

5. The app should provide the option of saving the credentials or userdetails so that user doesnt need to login again.

6. The app should also provide the option of saving the preferred driver details so that user doesnt need to search the driver again and again.

7. The app should provide the user option to login using fingerprint scan for users who do not want to login again and again

8. It should be tested that app doesnt hangs when a child user or any other user provides the invalid credentials multiple times.

9. For all pages/inputs, app should be tested for both potrait or landscape mode for people who like to view in landscape mode.

10. It should be possible to add the credit card/debit card for user who want to have automatic debit feature

11. It should be possible to pay with cash for users who doesnt have much knowledge about automatic debit feature

12. Security test should be performed on app for users who want to misuse the application for stealing users data, card/payment details etc.

13.  The left menu panel should be accessible from all pages.

14.  It should be possible to reset the password.

15. It should be possible to change the profile details of the user.

16. It should be possible to forget the saved credentials.

### Scenarios as an Administrator:

1. The administrator should be able to login with his/her credentials.

2. The administrator should be able to reset his/her credentials or retrieve forgotten credentials.

3. The administrator should be able to see all roles pages excluding the customers sensistive data like payment information.

4.The administrator should be allowed to rectify the historical data in the app but with proper audit logs.

5. The administrator should be able to help out the customer or driver with any query or with any problem in the app.

### UX Issues in the demo app:
1. Proper Validation message should be shown when user clicks on login without entering username or/and password, "Login failed. Please enter valid username or/and password". Also, message should be shown above the soft keyboard. It is only shown when the keyboard is not present and at the bottom of the screen.

2. Proper Validation message should be shown when user clicks on login with wrong username, "Login failed. Please enter valid username". Also, message should be shown above the soft keyboard. It is only shown when the keyboard is not present and at the bottom of the screen.

3. Proper Validation message should be shown when user clicks on login with wrong password, "Login failed. Please enter valid password". Also, message should be shown above the soft keyboard. It is only shown when the keyboard is not present and at the bottom of the screen.

4. No options available to reset the password in case user has forgetten the password or wish to change the password.

5. No option available to retrieve the user name when user has forgotten the user name.

6. The call button is provided at the bottom of the page. It should be provided inside the driver profile.

7. There is no option to logout or select any other option from Search Driver page or Driver Profile page. User has to go back and perform logout or any other option(if available).

8. User is not asked to confirm when user clicks on logout.

9. The color of different pages, like Logout, Login, Search Driver, Driver Profile are not consistent. On logout we are using yellow color whereas on other pages we are using grey color.

10. If you type in invalid driver name, inline validation doesnt show that this driver doesnt exist. User doesnt get message that please try providing any other username.

11. As a user, on Driver Profile page, user will not understand the meaning of calender and address provided as, what does data in these fields means. User should be provided with tooltip as soon as user clicks on these fields, informing the user meaning of these data.

12. On providing special characters in Search Driver field, inline validation doesnt show up to provide alphabets only.

13. User is not provided with an option of login with social profile.

14. There is no option to register a new user or create a new account. 

15. Sometime app is non resonsive when user clicks on Login button, even after providing valid inputs and no message is shown to the user.

16.In landscape mode, When we enter the username and click on next, user doesnt gets inline message, like in potrait mode, Type your password here.

17. In landscape mode, I can select the driver name multiple times and it gets appended in original driver name. It shouldnt be possible to select driver name multiple times. Also, when clicking on done,app doesnt provide any message like, "Please provide valid driver name". 

18. Clicking on Done, after selecting the driver name, driver is not shown until we change to potrait mode again.









