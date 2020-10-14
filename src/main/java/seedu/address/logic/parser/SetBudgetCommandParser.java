package seedu.address.logic.parser;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.DeleteCommand;
import seedu.address.logic.commands.SetBudgetCommand;
import seedu.address.logic.parser.exceptions.ParseException;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

public class SetBudgetCommandParser implements Parser<SetBudgetCommand> {
    @Override
    public SetBudgetCommand parse(String userInput) throws ParseException {
        try {
            //needs oop later
            double budget = Double.parseDouble(userInput.split(" ")[1]);
            return new SetBudgetCommand(budget);
        } catch (Exception pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SetBudgetCommand.MESSAGE_SET_BUDGET_FAIL), pe);
        }
    }
}