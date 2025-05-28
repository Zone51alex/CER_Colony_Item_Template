package data.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.impl.campaign.econ.impl.ItemEffectsRepo;

public class tem_ModPlugin extends BaseModPlugin {
  public void onGameLoad(boolean newGame) {
    float TEM_NANOFORGE_ITEM_QUALITY_BONUS = 0.4F;
    ItemEffectsRepo.ITEM_EFFECTS.put("tem_nanoforge", new Object(this, "tem_nanoforge"));
  }
}