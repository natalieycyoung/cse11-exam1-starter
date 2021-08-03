# Exam 1

### Release: 12am Friday August 20, 2021
### Due: 4pm Saturday August 21, 2021

This page details a **take-home exam** that you will complete over the next few days. You can’t communicate with anyone about the content of the assignment until you receive your grade. The course staff will not give debugging advice or answer questions about the problems. If you have technical trouble creating a screencast (detailed below) feel free to reach out for assistance. 

You can make use of any course notes, online resources, Java tools, and so on to complete the exam.

Syllabus policy on exams: https://ucsd-cse11-su221.github.io/#g:exams

You will complete the programming task below and submit ```ExamplesSearch.java``` to the ```exam1``` Gradescope assignment.

You will also submit a **video screencast** of yourself presenting a portion of
it to this [Google Form](https://docs.google.com/forms/d/e/1FAIpQLSdLObnTLZ0eRmiVF2lj0-1PzVGSLR2xJYCnp7rgahoogQOBgQ/viewform?usp=sf_link).

Submission checklist (see long descriptions below for full details):

- [ ] Fields ```task1a``` and ```task1b``` in ```ExamplesSearch``` class
- [ ] Three examples of testing ```task1b``` in ```ExamplesSearch``` class
- [ ] ```AreaLessThan``` class
- [ ] Two constructed ```AreaLessThan``` objects
- [ ] Four total tests for ```AreaLessThan``` (two for each object)
- [ ] ```EitherQuery``` class
- [ ] Constructed ```EitherQuery``` object
- [ ] Two tests using this constructed ```EitherQuery``` object
- [ ] Screencast
    - Show ID
    - Trace evaluation of ```task1b``` test
    - Trace evaluation of ```EitherQuery``` test

Your submission will be graded **after** the deadline. The Gradescope upload will just check to make sure that there aren’t any errors reported by Java when we try to run your programs, not whether tests succeeded or failed. You should test thoroughly yourself to make sure your program works as expected.


## Tasks

You can find the starter code in this repository. The starter code is very lightly adapted from [this reading](https://cseweb.ucsd.edu/classes/sp17/cse11-a/lecture11.html).


You should **not** change any of the existing methods or classes except for adding to ```ExamplesSearch```. Don’t change ```ImageQuery``` or the other query classes, just add new ones as described below.

### Task 1
- Add a new **field** to the ```ExamplesSearch``` class called ```task1a``` of type ```ImageQuery```. The fields value should be a query that returns ```true``` when calling the  ```matches``` method for images that have the extension ```"jpg"```.

- Add a new field to ```ExamplesSearch``` called ```task1b``` of type ```ImageQuery```. Its ```matches``` method should return ```true``` for images that have the keyword ```"ucsd"``` and do **not** have the keyword ```"ucsf"``` (```false``` otherwise). Construct ```ImageData``` inputs matching these descriptions, and show how the query you constructed behaves when matching each of them:

    1. An image that has the keyword ```"ucsd"``` and not ```"ucsf"```
    2. An image that has the keyword ```"ucsd"``` and has the keyword ```"ucsf"```
    3. An image that does not have either ```"ucsd"``` or ```"ucsf"``` as a keyword

### Task 2
Add a new type of query called ```AreaLessThan``` that represents a query that returns whether the area of an image (its width times its height) is less than an area provided to the query. It should implement ```ImageQuery```.

Test the new class by creating two example ```AreaLessThan``` queries, and testing **each** on two inputs: one example that returns ```true``` and one that returns ```false``` (4 tests in total). You can write these as fields in ```ExamplesSearch``` or as tester methods, your choice, but they must be clearly indicated as the tests for Task 2.

### Task 3
Add a new type of query called ```EitherQuery``` that represents a combination of two queries that returns true if either one matches, but false if both or neither match. For example, for an ```EitherQuery``` combining a keyword search for ```"apple"``` and a keyword search for ```"banana"```:

- It should return ```true``` when ```match```ing an ```ImageData``` with keywords ```"apple orange"```
- It should return ```true``` when ```match```ing an ```ImageData``` with keywords ```"fruit banana"```
- It should return ```false``` when ```match```ing an ```ImageData``` with keywords ```"apple orange banana"```
- It should return ```false``` when ```match```ing an ```ImageData``` with keywords ```"no fruit here"```

Then, create an ```EitherQuery``` object. Demonstrate using this query’s ```matches``` method on two different ```ImageData``` inputs, once returning ```true``` and once returning ```false```.

### Task 4 – Video
You will record a short video of no more than ```8 minutes```. Include:

- Show only your face and a picture ID (your student ID is preferred) for a few seconds at the beginning. You don’t have to be on camera the whole time, though it’s fine if you are. Just a brief confirmation that it’s you creating the video/doing the work attached to the work itself is what we want.
- For the second example from ```task1b``` – “An image that has the keyword ```"ucsd"``` and has the keyword ```"ucsf"```”:

    Run the program and show the output corresponding to the method call for this example. Then, starting from the line in your code with the the call to the ```matches``` method, indicate and explain each line of code that runs in your program while evaluating that method call. You can scroll to and click the lines to highlight them, or otherwise indicate each one. You should indicate them in the order that **Java will evaluate them** (this might be different than the order they appear in the file).

- For this task, repeat the process of running the program, showing the output, and indicating which lines run and in which order. This time, do it for one of the calls to the ```matches``` method of ```EitherQuery``` you created in Task 3.

An example of what your video should look like when doing this kind of explanation is here (Credits: Joe Politz):

https://drive.google.com/open?id=1E-TcVXSg9BI4MnWoVU9_BbcRJsu8ZhCf

PA5 has a tutorial for creating a screencast like this https://github.com/CSE11-SU121-Assignments/cse11-pa5-starter.

Here are some notes on how to improve your videos:

- Make sure to use a picture ID, either a driver's license or passport that has a picture of you. If you do not provide a picture ID, you will get a 0 on the exam until prove to us it was you who did the video.
- Make sure your picture ID and face are visible at the same time for three or four seconds. We must be able to pause the video and verify it's you. Again, if we can't verify it's you, you will get a 0 on the exam until prove to us it was you who did the video. Make sure to fill up the screen as much as possible with your face and picture id (i.e. don't stand far away from your camera).
- When you start recording your video, start with screen share off and camera on and show your picture ID and face (close-up!!). Then you can enable screen share (and disable camera) and walk through your code.
- Video must have sound! While highlighting your code, also make sure to explain the code. We must hear you explain it!
- Once you enable screen share, make sure to leave it on the entire time while explaining your code.
- Do not explain every test case! Only explain what you are explicitly told in the write-up.
- Keep your videos under 8 minutes. We will penalize all students who go over 8 minutes. To ensure you stay under 8 minutes, make sure to only explain the test cases that the write-up says you should. Do not explain extra code that is not requested by the write-up.
