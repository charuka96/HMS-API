package edu.icet.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {

    Integer id;
    String name;
    String address;
    String bloodgroup;
    String nic;
    String age;
    String category;
    String gender;
    String contact;
    String note;
    String allergies;

}
