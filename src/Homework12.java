public class Homework12 {
    public static void main(String[] args) {
        String email = "e12m6ail@1mail.com";
        char emailArray[] = email.toCharArray();


        System.out.println(isEmailCorrect(email));
    }

    static boolean isEmailCorrect(String email) {
        char emailArray[] = email.toCharArray();
        int i = 0;


        //check if first letter is correct (must be alphabetic
        if (!Character.isAlphabetic(emailArray[i])) {
            return false;
        }


        //Check the input before @
        while (i < emailArray.length && emailArray[i] != '@') {
            //only a-zA-Z0-9_. characters are acceptable
            if
            (
                    Character.isAlphabetic(emailArray[i]) ||
                            Character.isDigit(emailArray[i]) ||
                            emailArray[i] == '_' ||
                            emailArray[i] == '.'
            )
            {
                i++;
            }
            else {
                return false;
            }
        }


        //Check the input after @
        if (emailArray[i] == '@') {
            i++;


            //'.' can't be placed after @
            if(i < emailArray.length && emailArray[i] == '.') {
                return false;
            }

            while (i < emailArray.length) {
                //input after @ must consist of alphanumeric
                if (Character.isAlphabetic(emailArray[i]) || Character.isDigit(emailArray[i])) {
                    i++;
                } else if (emailArray[i] == '.') {
                    //email can't end with a dot nor can it have 2 dots next to each other!
                    if (i + 1 < emailArray.length && (Character.isAlphabetic(emailArray[i+1]) || Character.isDigit(emailArray[i+1]))) {
                        i++;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }


        //Check if the last part of an email has correct number of alphabetic (2-7)
        int lastPartLength = 0;
        for (int j = emailArray.length - 1; j >= 0; j--) {
            if (Character.isAlphabetic(emailArray[j])) {
                lastPartLength++;
            } else {
                break;
            }
        }
        return lastPartLength >= 2 && lastPartLength <= 7;
    }


}

