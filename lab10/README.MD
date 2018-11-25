## Comparison: 
We have used AspectJ feature programming in lab10 to implement the same problem in Assignment 1. Comparing both the solutions, I observed below points:

1. In lab 1, I implemented different classes for different gumball machine cases, which increased the size of the code. While using AspectJ we have implemented single machine with various configurations provided. Based on the configuration selection, we are able to get a desired output.  

2. AspectJ also provided flexibility for future extension. We can introduce a new configuration for new machine value e.g. $1 Gumball machine or different machine type very efficiently. 

## Screenshots showing the Feature Model Configs and Output:

### Gumball Machine Crank Model-> Value[25 Cent]
![crank25](https://user-images.githubusercontent.com/30582708/48976151-91cf9200-f036-11e8-9e9d-f64fe209e0f5.png)

#### Output:
![crank25_op](https://user-images.githubusercontent.com/30582708/48976153-9431ec00-f036-11e8-8ae0-19db673546f7.png)



### Gumball Machine Crank Model-> Value[50 Cent]
![crank50](https://user-images.githubusercontent.com/30582708/48976154-95fbaf80-f036-11e8-9f61-e4f8d8ce1dc4.png)

#### Output:
![crank50_op](https://user-images.githubusercontent.com/30582708/48976155-972cdc80-f036-11e8-8be9-37316c79f7d0.png)



### Gumball Machine Slot Model-> Value[25 Cent]
![slot25](https://user-images.githubusercontent.com/30582708/48976156-98f6a000-f036-11e8-8943-b94970ea8ec9.png)

#### Output:
![slot25_op](https://user-images.githubusercontent.com/30582708/48976157-9ac06380-f036-11e8-81cc-445deca1a9d6.png)



### Gumball Machine Slot Model-> Value[50 Cent]
![slot50](https://user-images.githubusercontent.com/30582708/48976158-9bf19080-f036-11e8-9e2a-bea75175ae44.png)

#### Output:
![slot50_op](https://user-images.githubusercontent.com/30582708/48976160-9dbb5400-f036-11e8-998d-fa00adb4898e.png)
