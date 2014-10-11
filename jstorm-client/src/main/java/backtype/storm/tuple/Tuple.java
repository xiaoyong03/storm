package backtype.storm.tuple;

import backtype.storm.generated.GlobalStreamId;
import java.util.List;

/**
 * The tuple is the main data structure in Storm. A tuple is a named list of values, 
 * where each value can be any type. Tuples are dynamically typed -- the types of the fields 
 * do not need to be declared. Tuples have helper methods like getInteger and getString 
 * to get field values without having to cast the result.
 * 
 * Storm needs to know how to serialize all the values in a tuple. By default, Storm 
 * knows how to serialize the primitive types, strings, and byte arrays. If you want to 
 * use another type, you'll need to implement and register a serializer for that type.
 * See {@link http://github.com/nathanmarz/storm/wiki/Serialization} for more info.
 */
public interface Tuple extends ITuple{

    /**
     * Returns the global stream id (component + stream) of this tuple.
     */
    public GlobalStreamId getSourceGlobalStreamid();
    
    /**
     * Gets the id of the component that created this tuple.
     */
    public String getSourceComponent();
    
    /**
     * Gets the id of the task that created this tuple.
     */
    public int getSourceTask();
    
    /**
     * Gets the id of the stream that this tuple was emitted to.
     */
    public String getSourceStreamId();
    
    /**
     * Gets the message id that associated with this tuple.
     */
    public MessageId getMessageId();
}
