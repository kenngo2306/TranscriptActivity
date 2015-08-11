# TranscriptActivity
You have written invoice applications that are limited by the fact that you were using arrays to store the data. Now that you have ArrayLists in your toolbelt, you are to write an transcript application that meets the following specifications:

It must have these classes

*Name:	Description
*Validator:	Provides methods that accept and validate user input.
*CourseEnrollment:	Represents a course enrollment, which includes a course code, credits, and grade.
*Transcript:	Represents a single student's transcript. The course enrollments are represented by an array list.
*TranscriptApp:	Contains the main method for the Transcript application.

------
*Transcript Class Information

---
-Constructor

      Transcript()
---
-Methods

void addCourse(CourseEnrollment courseenrollment)

ArrayList getCourses()

double getOverallGPA()

String getFormattedGPA()

