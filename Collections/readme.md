| Class         | Thread-Safe | Ordered    | Allows Duplicates | Key Feature                          | Use Case                         |
| ------------- | ----------- | ---------- | ----------------- | ------------------------------------ | -------------------------------- |
| ArrayList     | ❌           | ✅          | ✅                 | Dynamic array                        | Frequent get/set operations      |
| Vector        | ✅           | ✅          | ✅                 | Synchronized ArrayList               | Multi-threaded environments      |
| HashMap       | ❌           | ❌          | ❌ (for keys)      | Fast key-value store                 | Fast lookups                     |
| TreeMap       | ❌           | ✅ (Sorted) | ❌                 | Sorted keys                          | Sorted maps                      |
| LinkedHashMap | ❌           | ✅          | ❌                 | Preserves insertion order            | Order-sensitive mappings         |
| StringBuilder | ❌           | ✅          | ✅                 | Fast mutable strings                 | Building strings in loops        |
| StringBuffer  | ✅           | ✅          | ✅                 | Thread-safe version of StringBuilder | Threaded string manipulation     |
| HashSet       | ❌           | ❌          | ❌                 | Unique elements only                 | Storing unique items             |
| LinkedList    | ❌           | ✅          | ✅                 | Doubly-linked list                   | Queues, frequent inserts/deletes |
