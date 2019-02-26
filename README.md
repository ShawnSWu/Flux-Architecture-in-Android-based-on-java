# Android Flux architecture Demo
<img src="https://i.imgur.com/pIve1gQ.png" alt="Android Flux Architecture Blueprints"/>

The Android Flux architecture was proposed by Facebook to build their client web applications. Like Clean Architecture, although it is not designed for mobile applications, its features and simplicity allow us to use it well in Android projects.

## To understand Flux, there are two key features.

* **Data flow is always single-way**

    A single-way data flow is the core of the Flux architecture, and it's why it's easy to learn. As discussed below

* **Flux is divided into three main parts**

    * **View** : User interface. This creates an "Action" that responds to user "Actions".

    * **Dispatcher** : Pass all the "Actions" and take them to every "Store".

    * **Store** : Maintain the state of a specific application domain. They respond to the "Action" based on the current state, execute the business logic, and issue a change event when it is finished. This event is used by the view to update its interface.



        >**These three parts are all communicated through "Actions".
 "Action" is a simple basic object in project.**
 
 * Below is data flow demo, we trigger an event through "View" and "View" will create an event to create an "Action" by "ActionCreator", 
 * 
> **Below is data flow demo, we trigger an event through "View" and "View" will create an event to create an "Action" by "ActionCreator", 
and "Action" will pass through Dispatcher and Store then back to "View"**

## Data flow demo vedio 

![](https://i.imgur.com/mtjU1Dr.gif)
