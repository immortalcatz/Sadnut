package sadnut.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;

public class PlayerManager
{
	public List<PlayerInfo> players;
	private static final PlayerManager INSTANCE = new PlayerManager();

	public static final PlayerManager getInstance()
	{
		return INSTANCE;
	}

	private PlayerManager()
	{
		players = new ArrayList<PlayerInfo>();
	}

	public PlayerInfo getPlayerInfoFromPlayer(EntityPlayer player)
	{		
		for(PlayerInfo pi : players)
		{
			if (pi.playerUUID.equals(player.getUniqueID()))
				return pi;
		}

		if(player.world.isRemote && players.size() == 0)
		{
			players.add(new PlayerInfo(player.getName(), player.getUniqueID()));
			return getClientPlayer();
		}

		return null;
	}

	public PlayerInfo getPlayerInfoFromName(String name)
	{
		for(PlayerInfo pi : players)
		{
			if(pi.playerName.equals(name))
				return pi;
		}
		return null;
	}

	public PlayerInfo getPlayerInfoFromUUID(UUID uuid)
	{
		for(PlayerInfo pi : players)
		{
			if(pi.playerUUID.equals(uuid))
				return pi;
		}
		return null;
	}

	public PlayerInfo getClientPlayer()
	{
		if (!players.isEmpty())
			return players.get(0);
		return null;
	}
}