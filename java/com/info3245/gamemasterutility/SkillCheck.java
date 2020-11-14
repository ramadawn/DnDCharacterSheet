import java.util.Random;

public class SkillCheck {

    int DC;
    int abilityBonus;
    int checkValue;
    boolean checkPass;

    public String skillCheck(int aTaskDifficulty, int aSkill, CharacterSheet character) {

        //Get Difficulty Class
        switch (aTaskDifficulty) {
            case 0:
                DC = 5;
                break;
            case 1:
                DC = 10;
                break;
            case 2:
                DC = 15;
                break;
            case 3:
                DC = 20;
                break;
            case 4:
                DC = 25;
                break;
            case 5:
                DC = 30;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + aTaskDifficulty);
        }

        //Determine ability check bonus
        switch (aSkill) {
            case 0:
                abilityBonus = character.getAthleticsInt();
                break;
            case 1:
                abilityBonus = character.getAcrobaticsInt();
                break;
            case 2:
                abilityBonus = character.getSleightOfHandInt();
                break;
            case 3:
                abilityBonus = character.getStealthInt();
                break;
            case 4:
                abilityBonus = character.getArcanaInt();
                break;
            case 5:
                abilityBonus = character.getHistoryInt();
                break;
            case 6:
                abilityBonus = character.getInvestigationInt();
                break;
            case 7:
                abilityBonus = character.getNatureInt();
                break;
            case 8:
                abilityBonus = character.getReligionInt();
                break;
            case 9:
                abilityBonus = character.getAnimalHandlingInt();
                break;
            case 10:
                abilityBonus = character.getInsightInt();
                break;
            case 11:
                abilityBonus = character.getMedicineInt();
                break;
            case 12:
                abilityBonus = character.getPerceptionInt();
                break;
            case 13:
                abilityBonus = character.getSurvivalInt();
                break;
            case 14:
                abilityBonus = character.getDeceptionInt();
                break;
            case 15:
                abilityBonus = character.getIntimidationInt();
                break;
            case 16:
                abilityBonus = character.getPerformanceInt();
                break;
            case 17:
                abilityBonus = character.getPersuasionInt();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + aTaskDifficulty);
        }

        //Calculate the characters check value
        checkValue = new Random().nextInt(20+1+abilityBonus);

        String results;
        //List if character passed the skill check and return results.
        if (checkValue >= DC) {
            checkPass = true;
            results = character.getName() + " passed the skill check.";
        } else {
            checkPass = false;
            results = character.getName() + " didn't passed the skill check.";
        }
        
        return results;
    }

}
