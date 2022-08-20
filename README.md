The task was solved using the Strategy pattern.

Task:
There is a certain system that processes air travel. A flight is the transportation of a passenger from one point to
another with possible intermediate landings. Flight can be represented as a set of one or more elementary movements
called segments. A segment is an atomic transportation, which, for simplicity, we will characterize as a whole
two attributes: date/time of departure and date/time of arrival.
You need to write a small module that will filter a set of flights according to different rules. There can be a lot of
filtering rules. Also sets of flights can be very large. Rules can be set dynamically depending on the context of the
filtering operation.
Think over the structure of the module, create the necessary classes and interfaces. If you are familiar with Junit,
then cover your code tests. Do not consider the user interface. It is enough to output information to the console. No
third party libraries do not need to be used.

Exclude flights from the test set according to the following rules (each rule requires a separate output of the list
of flights):
1. departure to the current point in time.
2. there are segments with an arrival date earlier than the departure date.
3. the total time spent on the ground exceeds two hours (time on the ground is the interval between arrivals of one
segment and the departure of the next one).

