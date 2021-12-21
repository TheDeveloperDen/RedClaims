package redempt.redclaims;

import org.bukkit.Material;
import redempt.redlib.config.annotations.ConfigMappable;

@ConfigMappable
public class RedClaimsConfig {

	private int defaultClaimBlocks = 1000;
	
	public int defaultClaimBlocks() {
		return defaultClaimBlocks;
	}
	
	public Material claimTool() {
		return claimTool;
	}
	
	private Material claimTool = Material.GOLDEN_SHOVEL;
	
}
