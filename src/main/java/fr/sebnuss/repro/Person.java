package fr.sebnuss.repro;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;

/**
 * @author snussbaumer
 */

@Entity
@Getter
@Setter
public class Person {
    @Id
    private Integer id;

    @Version
    private int version;

    private String name;

    @Column(name = "update_date")
    private Date update;
}
