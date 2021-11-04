package a.b.c.d.e.f.g.h.i.j.k.l.m.n.o.p.q.r.s.t.u.v.w.xy.z.bungee;

import org.bukkit.*;
import net.md_5.bungee.api.plugin.*;

public class Start extends Plugin {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.AQUA + "Description: At this stage, this is a plugin only for the functioning of plugins for 11 and 14 Java");
        System.out.println(ChatColor.GREEN + "mMarketLib: Hi, I'm working!");
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "mMarketLib: All the guys, I'm disconnected!");
    }

}
