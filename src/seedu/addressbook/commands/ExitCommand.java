package seedu.addressbook.commands;

import java.util.Arrays;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.tag.Tagging;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Exits the program.\n"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_EXIT_ACKNOWEDGEMENT = "Exiting Address Book as requested ...";

    @Override
    public CommandResult execute() {

        StringBuffer tagLog = new StringBuffer();

        for(Tagging tagging: addressBook.tagLog) {
            tagLog.append(tagging.toString() + "\n");
        }

        return new CommandResult(tagLog + MESSAGE_EXIT_ACKNOWEDGEMENT);
    }

    public static boolean isExit(Command command) {
        return command instanceof ExitCommand; // instanceof returns false if it is null
    }
}
