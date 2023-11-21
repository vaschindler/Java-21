Java 21 new features
Gradle does not support Java 21 right now see here (https://docs.gradle.org/current/userguide/compatibility.html)
# Virtual Threads
* virtual threads are always daemon threads. The JVM will exit when all regular threads have finished, even if virtual threads are still running
* virtual threads are scheduled by the JVM, not the OS -> context switching is much cheaper
* virtual threads cannot be changed their priority
* pooling is not required for virtual threads
* blocking costs are much lower
* virtual threads can be reused for different tasks -> not suitable for thread local data
* much lower memory footprint

# Sequenced Collections
* enhance experience of using collections with SequencedMap, SequencedSet
* new reverse(), addLast(), addFirst() method

# Record Patterns
* record patterns are a new kind of pattern that can be used in instanceof expressions and switch expressions
* record patterns are used to test whether an object is an instance of a record class and to extract its components

# String Templates (Preview)
* Simplify the writing of Java programs by making it easy to express strings that include values computed at run time.
* The template processor (STR) is needed -> performs string interpolation
