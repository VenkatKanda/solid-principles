Open closed Principle
...............................
Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

the Single Responsibility (SRP) that stated that a module should have only one reason to change. 
If we think about OCP and SRP, we can observe that they are complementary. 
Code specifically designed with SRP in mind will be close to OCP principles or easy to make it respect those principles.
When we have code that has a single reason to change, introducing a new feature will create a secondary reason for that change. So both SRP and OCP would be violated. 
In the same way, if we have code that should only change when its main function changes and should remain unchanged when a new feature is added to it,
thus respecting OCP, will mostly respect SRP also.

Based only on the schema above, one can deduce that any class directly using another class,
                             would actually violate the Open/Closed Principle. And that is right, strictly speaking



