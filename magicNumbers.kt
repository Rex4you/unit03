CODE

Month = int(input("Enter a month (in numeric form) :"))         #Asking the user to enter a month.
Day =  int(input("Enter a day :"))                              #Asking the user to enter a day.
Year = int(input("Enter a two-digit year:"))                    #Asking the user to enter a two-digit year.
Determine = Month * Day ==Year                                 #determine whether the month times the day equals the year.
if Determine:                              #determine whether the month times the day equals the year and check.                                                   
    print(" The date is magic.")                                #if it is true display message.
else:                                                                                                  
    print("The date is not magic.")                             #else display another message.

OUTPUT

Enter a month (in numeric form) :6
Enter a day :10
Enter a two-digit year:60
 The date is magic.



Enter a month (in numeric form) :3
Enter a day :4
Enter a two-digit year:14
The date is not magic.
