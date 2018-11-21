
package nl.spijkerman.ivo.contactcard.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "age"
})
public class Registered implements Serializable
{

    @JsonProperty("date")
    public String date;
    @JsonProperty("age")
    public Integer age;
    private final static long serialVersionUID = -1679128736102679791L;

}