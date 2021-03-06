package mekanism.common.integration;

import java.util.stream.Stream;
import mekanism.common.Mekanism;
import net.minecraftforge.fml.InterModComms.IMCMessage;

public class IMCHandler {

    public void onIMCEvent(Stream<IMCMessage> messages) {
        //TODO: Should this be using InterModComms.getMessages(Mekanism.MODID)
        messages.forEach(msg -> {
            //Make sure we are the correct receiver
            if (msg.getModId().equals(Mekanism.MODID)) {
                //TODO: Fix IMC integration
                /*boolean found = false;
                boolean delete = false;
                String method = msg.getMethod();

                if (method.startsWith("Delete") || method.startsWith("Remove")) {
                    method = method.replace("Delete", "").replace("Remove", "");
                    delete = true;
                }

                for (Recipe<?> type : Recipe.values()) {
                    if (method.equalsIgnoreCase(type.getRecipeName() + "Recipe")) {
                        //TODO: Handle recipes as well as make some form of legacy support
                        //handleRecipe(type, msg, delete);
                        //found = true;
                        break;
                    }
                }
                if (!found) {
                    Mekanism.logger.error(msg.getSenderModId() + " sent unknown IMC message with method '" + msg.getMethod() + "'.");
                }*/
            }
        });
    }

    /*private <INPUT extends MachineInput<INPUT>, OUTPUT extends MachineOutput<OUTPUT>, RECIPE extends MachineRecipe<INPUT, OUTPUT, RECIPE>>
    void handleRecipe(Recipe<INPUT, OUTPUT, RECIPE> type, IMCMessage msg, boolean delete) {
        //TODO: Safety check. Maybe we should even have them send something other than nbt
        CompoundNBT nbt = (CompoundNBT) msg.getMessageSupplier().get();
        INPUT input = type.createInput(nbt);
        if (input != null && input.isValid()) {
            RECIPE recipe = type.createRecipe(input, nbt);
            if (recipe != null && recipe.recipeOutput != null) {
                if (delete) {
                    RecipeHandler.removeRecipe(type, recipe);
                    Mekanism.logger.info(msg.getSenderModId() + " removed recipe of type " + type.getRecipeName() + " from the recipe list.");
                } else {
                    RecipeHandler.addRecipe(type, recipe);
                    Mekanism.logger.info(msg.getSenderModId() + " added recipe of type " + type.getRecipeName() + " to the recipe list.");
                }
            } else {
                Mekanism.logger.error(msg.getSenderModId() + " attempted to " + (delete ? "remove" : "add") + " recipe of type " + type.getRecipeName() + " with an invalid output.");
            }
        } else {
            Mekanism.logger.error(msg.getSenderModId() + " attempted to " + (delete ? "remove" : "add") + " recipe of type " + type.getRecipeName() + " with an invalid input.");
        }
    }*/
}