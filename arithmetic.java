operators

arithmetic

*

+
/

conditional

>,<,==,!=,>=,<=

logical operatore

&&, ||,!
T T T
T F F
F T F
F F F


OR 
F F F
T T T
T F T
F T T
increment operatore
++
- -
scanner class--used to take input from keyboard
methods of scanner class
next()-string as input
nextInt()-integer

Flow control statements

branching --if ,
if else,if else if,switch case.
looping --for loop, 
while,
do while,
for each /advance for loop
i=5;
if(i= =0){
//block should execute
}
else{
//
}if else{

}

for()

switch(choice=1){
case 1:stmt1
       stmt2
	   break;
	   
case 2:stmt1
       stmt2
	   break;
default 1:stmt1
       stmt2
	   break;
	   	   
looping statements

loops are those statements which will run for infinite period of time 
controlled by boolean condition to limit no of executions


for(initialization;boolean condition;step){
//stmts
}

for(int i=1;i<=3;i++) {
	System.out.println("This is outer for loop");
	
	
	
	
for(int j=1;j<=2;j++) {
	System.out.println("This is inner for loop");
}
}


while

while(boolean condition){

//body of while loop
}

do while 

do{
//stmnts
}while(boolean condition);

