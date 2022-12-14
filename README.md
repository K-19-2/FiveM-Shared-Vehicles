# FiveM Shared Vehicles
 A helpful tool to help with making vehicles.lua files for qb-core.

### Discord:

Contact **K-19#0658** if you have any questions or for assistance with server development.

### Usage:

If you have a FiveM folder that has a bunch of different vehicle folders in it, run the **filelist.bat** in that folder. This file assumes that all folder names are the spawn code of the vehicle. 

This will create a file named **filelist.txt**, which is basically just all of the different folder names. Copy the contents of that into the **cars.txt** file, save it, and then run the python script by right clicking in the folder that **Car.py** is located in, click **Open in Terminal**, and type ***py Car.py***. Once the script has finished with all cars or the user has typed **quit**, then the code will be saved to **output.txt**

***NOTE:*** If the files ***cars.txt*** or ***output.txt*** are missing, it will not work. If you accidentally deleted one of those, just make a new text document and name it appropriately.

![Folder Example](https://i.imgur.com/SsmIsYU.png)

![Terminal Example](https://i.imgur.com/o6pm4iO.png)

[Python](https://www.python.org/downloads/) can be downloaded from that link.

Alternatively, you can also type each spawn code in manually, such as the example in the **cars.txt** file.

If you wish to quit the program at any time, do not close the terminal window or it may not save your progress. Type **quit** in any of the prompts to quit.

The price will need to be edited at a later time, and by default the shop each is set to is PDM. 

**ADDED .jar file and .java source code for those who may wish to use java instead of Python.**