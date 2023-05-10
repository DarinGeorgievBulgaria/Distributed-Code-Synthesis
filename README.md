# Distributed-Code-Synthesis
Third Year Project - Working only on my Lancaster University's VM accont
 
 
 
Darin Georgiev 
 
Distributed Code Synthesis 
 
B.Sc. Computer Science 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

















 
1.	Abstract 
The innovative technique known as "program synthesis" has revolutionized the way users can specify the desired output of a program and automatically generate the corresponding code. This approach is particularly advantageous when dealing with well-defined problems and predetermined outputs. In the present project, we have utilized the program by example approach to generate code that can solve the input-output mapping problem, which involves finding the operation that can transform the two numbers into a third number which all three are inputted by the user. To achieve this, I have adopted a strategy known as "Explicit Enumeration" approach, which involves explicitly constructing different solutions from which the program should select the one that satisfies the observations. Implementing this task using Java RMI ensures that the workload is distributed across multiple instances of the same program, resulting in faster and more efficient code generation. By spreading out code synthesis, we create a solid foundation for upcoming projects handling high volumes of operations. 
 
2.	Introduction 
The overall aim of the project on Distributed Code Synthesis (DCS) is to develop a program that can automatically generate code from specifications, while leveraging the power of distributed computing to improve the scalability and efficiency of the synthesis process. 
DSC is a relatively new field of research that aims to automate the process of writing code by using code synthesising techniques. The idea is to find the logic behind the input, which then makes it possible generate new code based on the given specification.  
There are several reasons why this project is worth doing. First, writing code is a time-consuming and error-prone task, and automating it could save developers a significant amount of time and effort. Second, code synthesis could help improve the quality of code by reducing the likelihood of bugs and other errors. Finally, code synthesis could enable non-experts to create software by providing a more accessible interface for programming. 
In terms of future applications, the potential uses of code synthesis are vast. For example, it could be used to generate code for specific tasks or applications, such as data analysis or machine learning. It could also be used to create code for different platforms or languages, making it easier to develop software that works across multiple systems. Additionally, code synthesis could be used to create new tools and frameworks that make it easier to build and maintain software.  
Overall, the project of Distributed Code Synthesis has the potential to revolutionize the way software is developed and maintained, making it faster, more reliable, and more accessible to a wider range of people. 
The aims of this project are to: 
•	Implement simple user interface in the terminal which takes three numbers as input and can present a result. 
•	Research how synthesising works and which way would be the best to design a simple synthesising algorithm which checks if a specified operation can be used between the first two numbers so that they are equal to the third one. 
•	Explore different ways of making the synthesis distributed and choosing an architecture appropriate for an algorithm which distributes different operations to different instances of the program. 
•	Testing using a variety of inputs and evaluating the results of the developed program. 
•	Improving the code if the results are not accurate. 
In this report, I will discuss my findings on Code Synthesis and Distributed Systems, and how I have integrated them into a program that tackles a specific problem. The task is to determine the operation that can be used between two numbers to make them equal to a third number. I will explore the various methods I have attempted and explain the reasoning behind the design choices I have made. 
 
3.	Background 
When delving into the subject of Distributed Code Synthesis, it is important to first examine its two underlying sub-topics: Distributed Systems and Code Synthesis. By gaining a thorough understanding of these two components, we can better comprehend the complexities of Distributed Code Synthesis. It is therefore imperative that we take the time to explore the core principles of both Distributed Systems and Code Synthesis in order to fully grasp the intricacies of this topic. 
1.	Distributed Systems 
Distributed System (DS) is a network of computers that work together to achieve a common goal, even though they are physically separated from each other. These computers, also known as nodes, communicate with each other through messages to coordinate their actions and share resources. The DS is designed to enhance performance, scalability, and reliability by breaking down complex tasks into smaller, more manageable parts that can be processed in parallel. A distributed system can be found in various applications, including cloud computing, peer-to-peer networks, and distributed databases. The primary advantage of a distributed system is that it can handle large amounts of data and provide high-performance computing capabilities, making it an essential component of modern computing. In a paper authored by Maarten van Steen and Andrew   distributed systems is provided. However, it must be noted that the system architectures discussed in the paper are primarily geared towards high-level applications and may not be directly relevant to the specific project at hand. While the paper offers valuable insights into the workings of distributed systems, it is important to carefully consider the applicability of the concepts presented to the context of our project. 
 
It's worth mentioning that the same authors have written a book on DS, which I found immensely helpful in my current project. Their book not only covers the foundational aspects of distributed systems but also delves into the high-level specifics of each type of system. Personally, I relied heavily on this book as it provided me with a comprehensive understanding of crucial components such as Client-Server communication(124-141), threads, synchronisation(104, 298), and RPC(173). I must say that the authors have done an exceptional job of explaining these concepts in great detail, which has helped me immensely in applying them to my project. 
 
There is another book on DS by George Coulouris, Jean Dollimore and Tim Kindberg which goes more in depth on Remote Invocation but in Java. They authors have written a few case studies on RMI one of which is a program that allows a few users to have a view of a drawing digital board which has geometrical figures drawn by each one of the users. I found that study particularly interesting as it shows the full implementation of their program using Java RMI. It should be noted that Java’s Remote Method Invocation is better approach than C’s Remote Procedure Call because RMI has the same functionality, but also has the ability to pass objects. From these two books I came to the conclusion that I should use Java RMI for the distribution part of this project. 
 
2.	Code Synthesis 
Code Synthesis (CS) is the process of automatically generating computer code from a high-level specification or model. It involves the use of specialized software tools that analyse the requirements and constraints of a given problem domain and produce code that conforms to those specifications. The goal of CS is to reduce the time and effort required to develop complex software systems, while also improving the quality and reliability of the resulting code. CS is particularly useful in situations where the problem domain is well-defined and the requirements are clearly specified, such as in the development of embedded systems, control systems, and other specialized applications. 
 
An example of CS is the “FlashFill” feature in Excel which was released in 2013. It has the ability to automatically fill in data when it senses a pattern. Examples of that would be to separate the first names from last names and place the new result in two new columns. This feature is based on a study called “Automating String Processing in Spreadsheets Using Input-Output Examples” by Sumit Gulwani. The author goes in depth how he has managed to create synthesis using splitting and concatenation to create substrings in order to process the inputted text. The algorithm heavily depends on Substring Extraction Logics, Traces, Conditionals, Loops, and Partitions, utilizing them repeatedly. Following the execution of the algorithm, the outputs are ranked based on the concatenation size, and the smallest one is selected as the final result. The author has chosen to use the Occam’s razor principle, which states that the simplest explanation is typically the most accurate.*10p – 5.3*” 
 
Another reason why this study is important is that it was referenced in “A Machine Learning Framework for Programming by Example”. The authors, one of which is Sumit Gulwani, explain how they have created a framework which learns from the input and ranks the possible solutions based on probability. They use many of the techniques from the previous study to synthesise code but here they also use machine learning to make the process faster and more efficient. I gained a deeper comprehension of the concept of code synthesis through the analysis of these two studies, which revealed its revolutionary potential in resolving a particular issue. However, to expand my knowledge on the subject, I embarked on a quest to explore publications that provide a broader perspective on code synthesis, rather than delving into a specific case study. 
 
I looked more in depth of Sumit Gulwani’s work and found a paper called “Dimensions of Program Synthesis”. The initial section of this paper is about the various applications of code synthesis and how it can prove to be beneficial to a diverse range of individuals, regardless of their proficiency in software development. Code synthesis has the potential to play a crucial role in the discovery of new algorithms, as creating a program that can solve a specific problem, demands a significant amount of time, knowledge, and human resources. Furthermore, it can automate the process of debugging software, and also aid developers in comprehending complex code that is otherwise challenging to understand its functionality. Additionally, code synthesis can be highly advantageous in automating repetitive tasks, and the project idea from my proposal falls precisely into this category. 
 
The main part of the project is divided to three “dimensions” with the first one being the intent of the user which is the most important one. The design of program synthesis should be created based on the way the user is going to interact with the program. This project will be based on input-output examples as the user will input only three number and will get a simple output of the operation used. The second dimension is search space which can vary depending on how many programs have to be checked if they are possible solution. In order for the program to be efficient the number of programs and their size should be restricted. The third dimension is Search Technique which can be Brute-force Search, Logical Reasoning and Machine Learning based, but choosing the correct one depends on the first two dimensions and how the program is going to be used. 
 
After I read that study I had more general idea of what I needed to structure my code. I started looking for more high-level information sources so I can understand how synthesis is programmed. I came across Armando Solar-Lezama’s lectures on Program Synthesis which helped me understand better the different search techniques, and which one should be used in which case. 
I have decided to write this project using Java as the primary programming language. There are a few reasons for this choice. Firstly, I am not a professional developer and I have had the most exposure to Java throughout my learning journey. Therefore, I feel more comfortable using this language to undertake this task. Additionally, in section 3.1 of the Background section from this report, I mention two books that strongly recommended the use of Java for this type of project. After reading through the recommendations and considering the requirements of the project, I am convinced that Java will be the most suitable language to achieve the desired outcome. Overall, while there may be other programming languages that could potentially be used for this project, my personal experience and the recommendations from trusted sources have led me to choose Java as the most practical and effective option. 
4.	Design 
4.1 Java RMI 
It took me a considerable amount of time to carefully weigh my options and determine the most effective structure and tools to utilize for this program. After perusing the materials provided in the two books from 3.1, I ultimately decided that RPC or RMI would be the most advantageous approach for the distribution aspect of this project. This approach seemed to be the most convenient and straightforward way to demonstrate distribution without requiring the use of complex protocols and sockets. Initially, I also contemplated the possibility of utilizing cluster-based distribution. However, after conducting further research and reading an insightful article on the topic regarding the problems that it has, I concluded that this approach would be better suited for software that involves the exchange of messages. As a result, I made the decision to commit to RMI over RPC, as it is more multifunctional, and I possess a greater depth of experience working with Java as opposed to C. 
Breg et. Al. (2012) explore the performance and interoperability of Java RMI using experiments. What I found useful from this study is the way they explain how Java RMI works. Their visualisation of the architecture can be seen on Figure 1. From the diagram we can see an arrow signed with the number one showing the first step which is the server creates an object of type remote and it is registered in a registry. The client then can obtain references to objects stored in the registry (2). When the client initiates a method on the remote object, the method is initiated on a stub object (3), which is located on the same Java Virtual Machine (JVM) as the client’s JVM. The stub objects creates a message containing the name of the method as well as its parameters. This message is then sent (4)to the associated skeleton object in the server’s JVM. The skeleton object gets the method name and parameters form the message and initiates the corresponding method on the remote object with which it is associated (5). The method is then executed by the remote object and the return value is passed back to the skeleton (6). The skeleton “marshals” the return value in a message and it is sent to the stub object (7). The return value is then unmarshalled from the message by the stub and the same value is returned to the client program (8). 
 
![Figure1](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/04128c82-2690-4e8f-bc23-bee2f3e0804d) 
Figure 1. 

In order to ensure that this architecture is functional, it is crucial to define the methods in an interface that extends RMI's Remote interface. It is essential that each method is declared to be able to throw RemoteException, which is necessary for handling errors that may arise during remote method invocation. The Server class must implement the newly created interface, and all of its methods must be initialized. A visual representation of this process can be found in Figure 2. When the client program initiates a method call on the proxy server, RMI sends the request to the remote JVM. From there, it is forwarded to the implementation. If there are any return values, they are sent back to the proxy and then to the client's program. This process ensures that the client can effectively communicate with the server and receive the desired outcome. 

![Figure2](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/73a310d1-8261-4d6a-97b2-284e3e4b10f4)
Figure 2. 

4.2 Code Synthesis Dimensions 
It can be said that the base of the distribution part between Client and Server of this project will rely heavily on Java RMI, but the next part that has to be designed is the synthesis. In order for it to be designed, first the three dimensions, which are mentioned in the last Sumit Gulwani's paper from 3.2 in the Background section, have to be defined. The first one is the intent of the user, which in this project is assumed that the user is going to use this program to find what operation can be used between the first two numbers that he or she inputs so that they are equal to the third number that is inputted. This means that our case is closest to the category of Input-Output examples where the user gives to the program a set of inputs and output which the program must find the logic between them. One of the problems with this approach it that it is difficult to define what is a good example of input and output and also how many should the user provide. I decided to choose the way which the author does not recommend, which is having a switch and case statement (Figure 3). The author does not recommend it because that approach is hardly scalable because it is corelated to the second dimension of the code synthesis which is Search Space. Due to the nature of the project the Search Space is rather small. It would have the size of 4 cases to be exact which is why I chose to use switch case statement regardless that it is not recommended. 

![Figure3](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/1bef1b9d-c76f-4ee4-b473-e85b61fb3f1e)
Figure 3. 

The third dimension is Search Technique. In the case of this program when I was designing it, I thought that the most convenient one is the Brute-force Search. This is the process of defining the possible solutions in the search space and checking each program to see if it satisfies the input constraints or not. There are a few successful projects using the approach one of which is an algorithm for mutual-exclusion which is a program that generates algorithms based on user's specifications such as number of processes, number of lines of code, size and type of variables. There is an algorithm generator which generates all possible algorithms that satisfy the specification. Then the algorithms are sent to a verifier which checks if the generated algorithm is a solution to the problem or not and if it is then it is sent to the user as a result. The authors have used the Brute-force approach in the algorithm verifier which has to check every single generated algorithm. From this paper it can be concluded that this type of search is the simplest, but can be expensive, which is there should be good optimisation in place. Another example of how the Brute-force search can be seen in the paper for the Superoptimizer which is a program that generates the shortest algorithm possible when it is given an instruction set. In other words, it has the ability to optimise programs and then evaluate if the program is shorter but also accurate. The two papers under consideration use the Brute-force search method for the calculation of simple algorithms. However, given the limited search space and uncomplicated calculations involved in obtaining a desired outcome, I am of the opinion that the most fitting approach for the generation of code synthesis would be to utilize a combination of the switch case statement and the Brute-force search technique. This approach would allow for a more thorough and comprehensive exploration of the search space, thereby increasing the likelihood of obtaining a successful outcome. Moreover, the switch case statement would provide a clear and concise framework for organizing the various possible outcomes, thereby facilitating the process of code synthesis. Overall, the use of the Brute-force search method in conjunction with the switch case statement represents a highly effective and efficient approach for generating code synthesis. 
4.3 Program Architecture 
The design of the algorithm for the synthesis is now specified, but still it does not distribute the operations. So instead of having the Client – Server architecture, I decided to change it to Client – Server – Workers architecture, where the Server will distribute the calculations of the different operations, so that each worker will calculate with a different operation (Figure 4). The initial design was to have a class Worker which had a switch case statement where each case is a different operation. That class had a constructor which would have been used to pass an operation from the Server when a Worker is initialised. Later I came to the realisation that even though the operations are distributed, they are calculated one after another (sequentially) and this is not what this project is aiming for. In order to get a distribution which is also not sequential, I decided to use threads and implement the Runnable interface in the Worker class. The creation of threads was with a for loop which makes the process of calculation parallel. I managed to get the results printed on the Terminal of the Server, but I needed to send them to the Client. Due to the nature of the run method from the Runnable interface the results could not be returned to the Server and then sent to the Client which is why I decided to use the Future API from the java.util.concurrent.Future library. In order the understand better the concept of futures in Java, I read a paper on how to make Futures safe in which I found the implementation chapter particularly useful. To make Futures work, I had to change the Worker class from Runnable to Callable<String>. It had a generic of type String because that was going to be returned by the call method which used to be run method. When I had the Future completely set up in my Server class, I managed to pass the results from the Worker thread to Client's Terminal.  

![Figure4](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/3c12117c-0361-40fe-8dd8-9075284f9d80)  
Figure 4. 

Upon careful reflection of the program, I arrived at the conclusion that while it is capable of synthesising code, it does not distribute operations in the manner outlined in the project proposal. As per the proposal, each operation was meant to be calculated in a separate instance of the program, necessitating a change in the program's architecture (Figure 5). Specifically, the Worker class had to be modified from implementing the Runnable interface to a class with a main method, enabling it to run independently on a terminal. To ensure compliance with the proposal, it was necessary to create four instances of the Worker class, each running on a separate terminal. After much consideration, the most logical solution was to develop a new class that implements the Runnable interface and features a run method that executes a bash script. This script is designed to open a new gnome terminal and run the Worker class. Finally, it is worth noting that thread creation still relies on a for loop of fixed size. The Worker class itself now connects to the Server the same the Client class does – locates the registry, looks up for the pre-defined name and connects. 

![Figure5](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/99c4a7b7-e30e-43c8-8063-aa5f342685dd)  
Figure 5. 
 
 
5.	Implementation 
During the implementation process, I found myself reaching for a valuable resource in the form of a comprehensive book covering the entirety of the Java programming language. This book was exceptionally valuable in enhancing my comprehension of the complex intricacies associated with Java RMI, as well as the utilization of threads and debugging techniques. Additionally, I discovered another highly useful book that provided me with the necessary knowledge to create effective bash scripts. Having had no previous experience with bash, this book was an absolute lifesaver, as it provided me with a thorough understanding of the syntax involved and enabled me to successfully implement a variety of specific tasks that I will delve into in greater detail later in this chapter. 
The program is created using Lancaster University's virtual machines. It is specifically made to run on that virtual machine from my personal account. It would need changes to run on any other device. 
5.1  
The program is comprised of three distinct folders, each containing both ".java" and ".class" files, along with three additional ".sh" files located outside of the folders. To gain a better understanding of the file structure, refer to the Appendices (!!!!!!). To successfully run the program, the "start.sh" script must be executed (as seen in Figure 6). Upon execution, three gnome terminals will open, each with a specific functionality and appropriately named. The first terminal will open the server folder and initiate the registry. The second terminal will wait for two seconds to allow the previous terminal to start and perform its operation before running the already compiled Server class. Similarly, the third terminal will wait for two seconds after the second terminal has started before opening the client folder and running the already compiled Client class. 
  
![Figure6](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/ca8ca4ef-44b6-4ad2-a822-ee045042568f) 
Figure 6 - "start.sh" bash script 

When the Server class is launched, a series of actions are set in motion to establish the server's functionality (Figure 7). One of these actions involves the initiation of the stub, which serves as a communication intermediary between the server and its clients. This stub is then bound with a unique name to the registry, allowing it to be easily identified and accessed by other entities in the network. This binding process is vital in ensuring that the server's services can be utilized by those who require them and is a critical step in establishing a reliable and efficient network infrastructure.  

![Figure7](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/baaf1d67-ed43-409b-b5ae-d161831f8c89)  
Figure 7 – Server.java/main 

As soon as the Client class is initiated, it will prompt the user to enter three different numbers. These numbers are allowed to be in decimal format and are initially stored as double data types. However, it is noteworthy that these numbers are immediately converted to BigDecimals, and the reason for this conversion can be found in the Implementation of the Code Synthesis, which will be discussed later on. Once the three numbers are collected, the program proceeds to connect to the registry and searches for the name of the stub (Figure 8). Following this, a method is invoked from the server called "numersIO," which is designed to accept three arguments as input. The method returns an ArrayList as its output, which contains the results of the computation. Overall, it is worth noting that the Client class is designed to be user-friendly and efficient. By collecting the input numbers and converting them to BigDecimals, the program ensures that all calculations are performed with the highest possible accuracy. Additionally, the use of the numersIO method guarantees that the computation is performed correctly and that the results are returned in a well-organized manner. 

![Figure8](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/61f71a36-feae-439b-a55a-16e12416e019)  
Figure 8 – Client.java/main 
	
  5.2 
The "numbersIO" method of the Server class can undoubtedly be considered as the most crucial function within the program. This method plays a pivotal role in the entire process as it takes the input and returns an ArrayList containing the operations that can be performed between the first two numbers to make them equal to the third one. This functionality is of immense significance as it serves as the foundation for all further calculations and manipulations within the program. Furthermore, the "numbersIO" method also initiates an object of type Numbers, which is utilized to store the three BigDecimal numbers obtained from the input. This step is essential in ensuring that the program can accurately perform the required mathematical operations. After the Numbers object has been initialized, the "startWorkers" method is called with an argument equal to 4. This method contains a for loop that iterates through the parameter specified, creating a new thread using the Multithreading class, which implements the Runnable interface. The run method of each thread is then initiated, as depicted in Figure 9. Each of these threads is responsible for executing a script from a specific directory using ProcessBuilder. It is worth noting that the same line of code can also be implemented using "Runtime.exec()". However, after conducting extensive research, it was found that there is no significant difference between the two methods, and using either is simply a matter of personal preference. 

![Figure9](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/9bb0e3be-8b82-426f-97da-6e9c7e3bac3d)  
Figure 9 – Multithreading.java/run 

Upon executing the "workers.sh" bash script, a new terminal will be launched. This terminal will have its default directory set to the server folder. The initial command that will be executed is "cd ..", which will change the working directory of the terminal to one folder up. This is followed by the command to enter the workers folder and run the compiled Worker class. To ensure proper execution of the script, there is a third command on line three that instructs the script to wait for ten seconds. This allows sufficient time for the Worker class to carry out its assigned tasks. Once the ten seconds are up, the script will close the terminal. By following these steps, the "workers.sh" bash script can effectively carry out its intended functions. It provides a seamless and efficient way to manage workers and their tasks. 

![Figure10](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/65fd845e-a43b-45b2-8f68-bc7821120b20)  
Figure 10 – workers.sh 
	5.3 
When the Worker class is started, it connects to the registry and looks for the name of the stub. After that it invokes the "getOperation" from the Server. This method loops over a list of operations type String and returns an operation which is also removed when returned. It invokes another method callled "fillList" which adds all operations to that list if it is empty. This method is important because after the initiation of the threads, all of them are going to try to use this method, therefore modify the ArrayList with operation, which is why it is important for this method to be synchronized. 
After receiving an operation to use, the method "getAllNumbers" from the Server is initiated. It returns an ArrayList which stores objects of type BigDecimals. After that there is a switch case where every case is a calculation with a different operation. The reason for using BigDecimals instead of doubles is that calculations with doubles are inaccurate. When the snippet of code from Figure 11 is executed, it produces a result of 0.7000000000000001, instead of 0.7. The reason for that inaccuracy is that double-precision floating point value such as the double type is 64-bit value, and it is not exact. There are infinite possible real numbers and only finite number of bits. After the calculation using the allocated operation if the result is equal to the third number, then that operation is added to an ArrayList which is in the Server class. If that result is not equal to the third number, then "null" is added to the list. 

![Figure11](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/95b70c61-275b-4573-9bd7-8ea3c612cdb1)  
Figure 11. 

The edge cases such as dividing by 0 or having a non-terminating decimal as a result are handled with the first one simply not making the calculation and the second one with using the RoundingMode class. 
When all possible operations are added to the ArrayList and it's size it equal to 4, then that list is passed using the return statement of the numbersIO method. The results are then presented in the Client's terminal and after that a bash script is executed using the same technique as it the Multithreading class. This bash script has the functionality to close the program. 
 
6.	System in Operation 
To successfully execute the program, it is essential to navigate to the directory where the program is stored. Once you have located the program directory, the next step is to execute the bash script. This process can be viewed in greater detail in Figure 12. 

![Figure12](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/02c2e07e-e8a4-4954-8440-259accc8f5a0)  
Figure 12. 

When you execute the command "./start.sh", three new terminals will appear on your screen, one after the other. The first one will be responsible for starting the registry, whereas the second one will create an instance of the server. Finally, the third terminal will be the Client class, which anticipates the input of the first number. It's fascinating to observe how each terminal plays a unique role in this sequence of events, contributing to the overall functionality of the program. When the three numbers are inputted separately, four new terminals should appear on the screen (Figure 13). It can be noticed that on each one there is the operation that the worker is going to use, the three inputted by the user numbers, and also if the specific operation is a solution or not. In the case demonstrated in figure 13, we can see that the numbers are 10, 5 and 5 and that the only possible operation is subtraction.  

![Figure13](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/5020545e-40cd-44e8-a1df-f7fe82f69004)  
Figure 13. 
  
In examining figure 14, one can readily observe the terminal of the Client. Within this display, we are able to discern the various inputted numbers, as well as a comprehensive list of operations. I have deemed it necessary to highlight this aspect, as it serves to facilitate the identification of any potential issues that may arise. Additionally, it is noteworthy that the program is designed to yield a complete array of operations rather than a solitary result. This means that in cases where multiple operations meet the specified criteria, they can all be presented for consideration. This approach is particularly advantageous in terms of scalability, as it is able to accommodate a broader range of values and outcomes than a more limited, single-value approach. After the moment the results are displayed, a countdown from ten starts and when it reaches the number one the terminals start closing. It should be noted that this process can be interrupted if a terminal is clicked. 

![Figure14](https://github.com/DarinGeorgievBulgaria/Distributed-Code-Synthesis/assets/95240962/9697f13d-fb20-48fe-8f36-ab7ffc91357c)  
Figure 14. 
 
7.	Testing and Evaluation 
The program under evaluation takes three numbers as input from a Client class and finds which operations can be used between the first two numbers so that they are equal to the third one. The program uses a Server class to distribute the operations to Worker classes, each of which performs a different operation. The results are presented in the client class, which also accepts decimal numbers as input. To ensure the correctness and effectiveness of the program, I read a paper on software testing techniques where the author goes in depth in various testing and evaluation techniques that can be applied, such as unit testing, integration testing, system testing, and acceptance testing. 
7.1 Unit Testing: 
Unit testing involves testing each component of the program in isolation to ensure that it behaves as expected. In this program, the client class, server class, and worker classes tested independently. For instance, a unit test was created to ensure that the client class can accept decimal numbers as input and pass them to the server class. Similarly, a unit test was designed to verify that each worker class performs the designated operation correctly. 
7.2 Integration Testing: 
Integration testing involves testing how the different components of the program interact with each other. In this program, integration testing was performed to ensure that the Server class correctly distributes the operations to the worker classes and receives the results back. Also, integration testing was done to ensure that the client class displays the results correctly. 
7.3 System Testing: 
System testing focuses on testing the quality of the entire program. A system test is based on the functional requirement of the specification of the program. In this program, functional testing was done by testing the program with various inputs, including edge cases (7.5). 
7.4 Acceptance Testing: 
Accepting testing is when a program is given to the users to the users to test themselves. In the case of this program, it can't be tested by users due to the confidentiality of the project. But in order to simulate user testing, I used a random number generator and a calculator to input all different values. Using this approach, I found out that doubles did not produce accurate results, after which were replaced with BigDecimals. 
7.5 Edge Cases: 
Edge cases refer to input values that are at the extreme ends of the input range or that are unlikely to occur in normal usage. In this program, the examples of edge cases include: 
	- Input values that are very large or very small 
- Decimal inputs with a large number of decimal places 
-Negative input values 
-Zero input values 
The first three were made possible because the BigDecimal class was used in order to implement the numbers. It has the functionality to convert the numbers to Strings which makes it possible to use number of all sizes in calculations and have accurate results. The edge case, where zero is the second number, makes the division impossible. That case is handled using an if statement which simply skips the calculation part and displays a message that is not possible to be calculated. Testing the program with these edge cases can help identify potential issues such as overflow or underflow errors, accuracy issues, or unexpected behaviour. Therefore, testing with edge cases is essential to ensure that the program is robust and reliable. 
 
8.	Conclusion 
In conclusion, it can be stated that this distributed code synthesis project was successfully developed and tested in achieving its objective of finding the operation that can be used between two decimal numbers to make them equal to a third number. The project has demonstrated how a simple task can be implemented using distribution and basic variation of code synthesis. 
Program synthesis on its own is an innovation but combination with the distribution is what is going to take softwares to the next level. I believe that this combination can make program synthesis faster and more scalable but only if the correct program synthesis dimensions are selected. The relevance of this project lies in its potential to be applied to a wide range of real-world problems that require complex computations. For instance, it can be used by non-programmers to develop software without any computer knowledge, it can be used by programmers to create even more complex and innovative softwares. If program synthesis evolves to being able to solve non-software related problems, then this type of technology has the potential to solve complex real-world problems. It can also be used in the field of engineering to optimize the design of structures, machines, and systems. 
Moreover, the project can be the one creating a new category of software which can be used by researchers to base their innovations on this approach. This topic should be researched more because by leveraging the power of distributed computing and program synthesis, teams can work together to solve complex problems more efficiently and effectively. 
In the future, this project can be further developed to include more complex operations and variables. For example, the program can be expanded to include more than three decimal numbers as input or to allow for the use of variables such as symbols and equations. Another possibility is to allow the repetition of numbers and make calculations with infinity numbers. The code synthesis dimensions can be changed to accommodate a wider selection of operations. Additionally, the program can be optimized to run on different platforms, including mobile devices and cloud computing platforms. 
Overall, the distributed code synthesis project has demonstrated the potential of using distributed computing to solve complex problems. The project has shown that by leveraging the power of distributed computing, we can develop innovative solutions that can be applied to a wide range of real-world problems. As such, this project represents an important contribution to the field of computer science and has significant implications for the future of computing. 
 
 
9.	References 
9.1.	Van Steen, M. and Tanenbaum, A., 2018, “Distributed systems”. Available at: http://www.dgma.donetsk.ua/docs/kafedry/avp/metod/van%20Steen%20-%20Distributed%20Systems.pdf.
9.2.	Coulouris, G.F., Dollimore, Jean and Kindberg, Tim (2005) Distributed systems : concepts and design. 4th ed. Harlow: Addison-Wesley.
9.3.	van Steen, M., Tanenbaum, A.S., 2016, “A brief introduction to distributed systems.”. Available at: https://doi.org/10.1007/s00607-016-0508-7
9.4.	support.microsoft.com. (n.d.). Using Flash Fill in Excel. [online] Available at: https://support.microsoft.com/en-us/office/using-flash-fill-in-excel-3f9bcf1e-db93-4890-94a0-1578341f73f7.
9.5.	Gulwani, S. (2011) “Automating string processing in spreadsheets using input-output examples”, in Proceedings of the 38th annual ACM SIGPLAN-SIGACT symposium on principles of programming languages. ACM, pp. 317–330. doi:10.1145/1926385.1926423.
9.6.	Aditya Krishna Menon, et. Al. (n.d.), “A Machine Learning Framework for Programming by Example” Available at: http://proceedings.mlr.press/v28/menon13.pdf
9.7.	Sumit Gulwani, (n.d.) “Dimensions in Program Synthesis”, Available at: https://www.microsoft.com/en-us/research/wp-content/uploads/2016/12/ppdp10-synthesis.pdf
9.8.	Armando Solar-Lezama, 2018, “Lecture 2- Introduction to Inductive Synthesis” [online] Available at: https://people.csail.mit.edu/asolar/SynthesisCourse/Lecture2.htm
9.9.	Hartigan, J. (1977) Distribution Problems in Clustering, Classification and clustering : proceedings of an Advanced Seminar conducted by the Mathematics Research Center, the University of Wisconsin at Madison, May 3-5, 1976 /. New York :: Academic Press, pp. 45– 71. doi:10.1016/B978-0-12-714250-0.50007-3.
10.	Bar-David, Y., Taubenfeld, G. (2003). Automatic Discovery of Mutual Exclusion Algorithms. In: Fich, F.E. (eds) Distributed Computing. DISC 2003. Lecture Notes in Computer Science, vol 2848. Springer, Berlin, Heidelberg. https://doi.org/10.1007/978-3-540-39989-6_10
9.11.	Henry Massalin, 1987, “Superoptimizer: a look at the smallest program.”, pp. 122–126, Available at: https://doi.org/10.1145/36177.36194
9.12.	Breg, Fabian & Diwan, Shridhar & Villacis, Juan & Balasubramanian, Jayashree & Akman, Esra & Gannon, Dennis. (2012). “Java RMI Performance and Object Model Interoperability: Experiments with Java/HPC++ Distributed Components.” Available at: https://www.researchgate.net/publication/233943469_Java_RMI_Performance_and_Object_Model_Interoperability_Experiments_with_JavaHPC_Distributed_Components
9.13.	Oracle.com. (2017). The for Statement (The JavaTM Tutorials > Learning the Java Language > Language Basics). [online] Available at: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html.
9.14.	Welc, A., Jagannathan, S. and Hosking, A. (2005) ‘Safe futures for Java’, OOPSLA '05 conference proceedings : 20th annual ACM Conference on Object-Oriented Programming, Systems, Languages and Applications : October 16-20, 2005, San Diego, California, 40(10), pp. 439–453. doi:10.1145/1103845.1094845.
9.15.	Arnold, K., Gosling, James and Holmes, David (2006) The Java programming language. 4th ed. Upper Saddle River, NJ: Addison-Wesley.
9.16.	Garrels, M. (2010). Bash Guide for Beginners (Second Edition). [online] Google Books. Fultus Corporation. Available at: https://books.google.co.uk/bookshl=bg&lr=&id=OP1tAQP47b4C&oi=fnd&pg=PA2&dq=bash+script&ots=J8cn8FbAZh&sig=sBGb8lhvPXkZmqbRQ6MpKulA5H0&redir_esc=y#v=onepage&q=bash%20script&f=false
9.17.	oracle.com. (n.d.). RoundingMode (Java Platform SE 7 ). [online] Available at: https://docs.oracle.com/javase/7/docs/api/java/math/RoundingMode.html
9.18.	Luo, L. (n.d.). Software Testing Techniques Technology Maturation and Research Strategy Class Report for 17-939A Software Testing Techniques Technology Maturation and Research Strategies. [online] Available at: https://www.cs.cmu.edu/~luluo/Courses/17939Report.pdf.


10.	Appendices 
10.1 Project Proposal 
Final Year Project Proposal
Distributed Code Synthesis
Abstract
This project proposal will aim to research how code synthesis can be distributed in program space. Even though the code synthesis field is quite diverse, this project is focused on “programming by example” where the user provides some input and output examples, and the program synthesises a function with the logic to transform the given input to the given output. 

This project has for two stages for completing it successfully. The first one is creating an algorithm which finds the logic between the input and the output. The second stage is distributing the different permutations to different instances of the program and presenting the outcome to the user in a user-friendly way.

1.	Introduction
Every day the segment of population that has access to computers is increasing, but still learning to program such devices is difficult. The usual way for programming a computational device to solve a problem is designing an algorithm then implementing it. All of this requires good understanding of the problem’s domain and proficiency in computer programming, which is not available to everyone with a computer. “Automated program synthesis has the potential to change the way general-purpose computational devices are used by enabling non-expert users to solve problems in an automated fashion without designing and implementing a new algorithm.” [1].

This proposed project will aim to investigate how a synthesis can be created using only numbers as input and output. The synthesis will be distributed in program space to demonstrate how a task can be disassembled to smaller pieces each of which is sent and processed by a different instance of the program.
This project proposal will be divided into the following sections:
-	Background
-	Aims and Objectives
-	Methodology
-	Program of work
-	Resources required
-	References
In order to provide a clear picture of the progress of the work and the deadlines for these tasks, a Gantt Chart will be provided in the “the program of work” section that will describe the project plan by week. The resources that will be involved in this project will be described in the "resources required" section.


2.	Background
This project will cover Distributed Systems and Code Synthesis and there are no previous projects related to both topics combined. There is a study for code synthesis regarding the challenges and opportunities that come with it [1]. The authors of this article review the different types of users that would use program synthesis such as software developers, control engineers and non-expert programmers. It can be concluded that this type of programming would be useful to most of the people using computational devices. 

An example of code synthesis for non-expert programmers is the “Flash Fill” feature released in Excel 2013 which is also mentioned in the same article. There is a paper on the “Flash Fill” feature which describes in depth the synthesis algorithm that it is based on.[2] It caught my interest as it is a function of Excel which I have been using a lot and probably most of the people that use Excel. I have always wondered how it works and how it always come us up with the exact function I need. The paper mentioned above explains how the algorithm ranks multiple solutions, has fast convergence and how it can detect noise in the user’s input. This proves that code synthesis can be useful for non-programmers.

An example of code synthesis for programmers is the DynaMoth engine for code synthesis [3]. This study covers how they have designed new code synthesis engine for the Nopol repair system on Java. The authors go in depth on how their algorithms work, how they optimized them and how they perform using the Defects4J dataset. The results are that DynaMoth managed to fix 27 bugs out of 224 from Defects4J. They define the results as encouraging because that is just the beginning of DynaMoth and there are further optimizations that are going to be implemented. As a result of this study, we can conclude that code synthesis has the potential to be useful for developers in terms of fixing bus automatically in their code.

To get a deeper understanding of Distributed Systems I used the book “Distributed Systems” by Maarten van Steen and Andrew S. Tanenbaum [4]. The authors cover a big variety of topics from what is a distributed system to advanced topics such as coordination, fault tolerance and security. I went more in depth in the thread section and the different types of algorithms, more specifically centralized, distributed, token-ring and decentralized algorithms.

3.	  Proposed Project

3.1	  Aims and Objectives
The aim of the project is to investigate how code synthesis can be distributed through program space. This will be a program by example project meaning it will be created just to be able to solve one specified type of task taking certain input to provide specific output. In order to create this software, the following objectives will be involved:

•	It is necessary to create a program that can take three numbers as input and find how the first two numbers can be equal to the third number. The program should have an algorithm which goes through the operations – addition, subtraction, multiplication, division.
•	That program should be able to distribute the different operation through different instances of the program.
•	The results should be displayed in user-friendly way.’

3.2	Methodology
This project will be divided into the following parts:

-	Structuring the program in PlantUML
-	Developing an algorithm that finds the correct operation on one instance of the program.
-	Distributing the different operations to different instances of the program
-	Optimisation and documentation
-	Making the output user-friendly
-	Evaluation

I will use PlantUML or other program to create two diagrams of the structure of this project. There will be one diagram before the distribution and one after. Both will be used by me for personal reference.

Following the PlantUML diagram I will code the first part of the project on Java where the program will run on one instance of the program. I will research more on whether I should implement concurrency or not on this stage of the project. 

Once the first part of the program is done, then I will make it to distribute the different operations to different instances of the same program. I will follow the second PlantUML diagram and use the Java RMI library to complete the task.

When the distribution is done, I will optimise the program and all of the documentation needed for further use. With that I will make the program able to display the results in a user-friendly manner.

The last part is writing a report covering every step of the process in depth.

4.	Programme of Work
This project will be running from October 2022 to March 2023.

The first phase of this project will involve structuring the program and creating two PlantUML diagrams for my personal use. This phase will run from November to December.

After that I will start the first part of the programming which involves developing an algorithm that finds the correct operation on one instance of the program. This part will start mid-December until mid-January.

The second part of the program, which is on making the program able to distribute the operations through different instances of the same program, will start straight after the previous section and finish until mid-February.

The optimisation and documentation will take a week. With that I will make the program able to display the results in a user-friendly way.

Next, the main stage of writing a report will also take place, which will cover in detail all of the objectives and how were they executed during this projects




5.	Resources Required

Access to at least one device that has VScode and can run Java or has installed VMWare Horizon Client so that I can access Lancaster University’s virtual machines. Apart from that the device must have internet connection and Microsoft Word so that the final report can be done.


6.	References
1.	Program synthesis: challenges and opportunities (Cristina David and Daniel Kroening, 13 October 2017):
https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5597726/
Accessed 9th November 2022 
2.	Automating string processing in spreadsheets using input-output examples (Sumit Gulwani, 26 January 2011):
https://dl.acm.org/doi/abs/10.1145/1925844.1926423
Accessed 9th November 2022
3.	DynaMoth: Dynamic Code Synthesis for Automatic Program Repair (Thomas Durieux & Martin Monperrus, 14 May 2016):
https://dl.acm.org/doi/epdf/10.1145/2896921.2896931
Accessed 9th November 2022
4.	Distributed Systems – Third Edition (Maarten van Steen & Andrew S. Tanenbaum, 2018):
http://www.dgma.donetsk.ua/docs/kafedry/avp/metod/van%20Steen%20-%20Distributed%20Systems.pdf
Accessed 10th November 2022
