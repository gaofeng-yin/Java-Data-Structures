<h1>Linked Lists</h1>
<li> The array is a low-level data structure that can be used to store the
elements of a collection, arranged in a linear fashion.</li>

<li> But, as you know, the array has a serious drawback:<ul>		                                                                                                    	<li>Its capacity is soon fixed at the moment it is created, not allowing its expansion
in case of necessity.</li>
<li> And, moreover, the insertion and removal operations of elements from an
inner position thereof can be time consuming given the possible need to move
many of the elements already stored.</li>
</ul>
<li> The linked list appears as an alternative linear data structure to the
array:</li><ul>
<li> Resolving, completely, the limitations of the arrays;</li>
<li> Being a structure of a dynamic nature, its size increases and decreases over
time, in perfect harmony with the amount of elements that it effectively needs
to keep.</li><ul>
<li> One can even say that it has virtually unlimited capacity, since it will only depend
on the available memory resources.</li></ul></ul>

<br>
<h1>Stacks</h1>
<li> The Abstract Data Type (ADT) Stack collects arbitrary objects.</li>
<li> The insertion and removal of elements follows the scheme known
as LIFO (last-in first-out) or, equivalently, FILO (first-in last-out).</li>
<li> Think, for example, of a stack of books: the last one you put in will
be the first one to be removed.</li>

<li> Main operations of a stack:</li><ul>
<li> push(object): inserts an object;</li>
<li> object pop(): removes and returns the last inserted object;</li></ul>

<li> Other auxiliary operations:</li><ul>
<li> object top(): returns the last inserted object;</li>
<li> int size(): returns the number of objects collected;</li>
<li> boolean isEmpty(): indicates whether there are no objects collected.</ul></ul>

<h3>Possible applications of a Stack</h3>
<li> Historic of pages visited by a browser;</li>
<li> Come back in operations performed (Undo) in any application that
has this functionality – in a text editor, for example;</li>
<li> Invocation of methods by the Java virtual machine (JVM);</li>
<li> As auxiliary data structure of certain algorithms;</li>
<li> Etc.</li>


<br>
<h1>Queues</h1>
<li> ADT Queue collects arbitrary objects.</li>
<li> The insertion and removal of elements follows the scheme known as FIFO (firstin first-out).</li>

<li> This is a linear data structure that allows you to insert elements from one end
of the collection and remove them from the other,</li><ul>
<li> ensuring, in this way, FIFO behavior;</li>
<li> the first to be inserted (the one at the head of the queue) is the first to be removed;</li>
<li> implements the typical behavior of a waiting line.</li></ul>
<li> Main operations of a queue:</li><ul>
<li> enqueue(object): inserts an object at the end of the queue;</li>
<li> object dequeue(): removes and returns the object from the front of the queue;</li></ul>
<li> Other auxiliary operations:</li><ul>
<li> object first(): returns the object from the front, without removing it;</li>
<li> int size(): returns the number of objects collected;</li>
<li> boolean isEmpty(): indicates whether there are no objects collected.</li></ul>

<h3>Possible applications of a Queue</h3>
<li> Implementation of waiting lines (so present in our daily lives);</li>
<li> Access to shared resources (network printer, for example);</li>
<li> Answering requests by the Web server;</li>
<li> As auxiliary data structure of certain algorithms;</li>
<li> Etc.</li>

<br>
<h1>Deque</h1>
<li> A Deque (Double-ended queue) is a queue that supports the insertion and
removal of elements either at the beginning or at the end of the collection.</li>
<li> Deque is a more general ADT than Stack and Queue together, and this feature
may be useful in some specific applications.</li>

<li> For example, the waiting line in a restaurant may be better represented by the
behavior of a deque:</li><ul>
<li> Sometimes the customer who is ahead can be withdrawn from the queue, and only
then realize that there is still no table available; in this case it will be convenient to
put the person back at the beginning and not at the end of the line; another
recurring situation is the client who is in the end getting impatient and leaving the
restaurant (and we would have to have an even more general queue if we were to
model the abandonment of customers in the middle of the queue).</li></ul>
<li> Therefore, a Deque can behave as a Queue, as a Stack,
or as a more complete and more versatile data
structure.</li><ul>
<li> it has two symmetric groups of methods to ensure
insertion and removal operations at both ends of the
queue.</li></ul>