# Algo-PA1
Task scheduling algorithm 


five barbers are assigned to customers based on their type of service request ($10, $20, $30, $40) 

the first iteration (with respect to the barbers) is first come first serve basis, ie the barber who comes first gets the first customer and so on

from the second iteration, the algorithm determines which barber is next such that the difference between the income at the end of the day of 
all the barbers does not differ more than the average of all commisions in that day. 

Also, Work in subsequent rounds is assigned according to the new order until there is a difference of d (set by the user) or more in earnings, 
which triggers a change in the order of assignments
