package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * It records a transaction of a tag addition/deletion
 */
public class Tagging {
    private Person person;
    private Tag tag;
    private boolean addition; // true means it is an addition, false means deletion

    /**
     * Constructs a tagging with the given data.
     *
     * @param person the person whose tag was added/deleted in the last transaction
     * @param tag the tag added/deleted in the last transaction
     */
    public Tagging(Person person, Tag tag, boolean addition) {
        this.person = person;
        this.tag = tag;
        this.addition = addition;
    }

    public String toString() {
        return (addition?"+ ":"- ") + person.getName() + " " + tag.toString();
    }
}
