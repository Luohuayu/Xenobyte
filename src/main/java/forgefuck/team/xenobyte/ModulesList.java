package forgefuck.team.xenobyte;

import java.util.ArrayList;

import forgefuck.team.xenobyte.api.module.CheatModule;
import forgefuck.team.xenobyte.modules.AdvancedTooltip;
import forgefuck.team.xenobyte.modules.AdvertHack;
import forgefuck.team.xenobyte.modules.AntiKnockBack;
import forgefuck.team.xenobyte.modules.AutoDrop;
import forgefuck.team.xenobyte.modules.AutoSprint;
import forgefuck.team.xenobyte.modules.BiblioAtlasGive;
import forgefuck.team.xenobyte.modules.BiblioSignEdit;
import forgefuck.team.xenobyte.modules.BiblioTableGive;
import forgefuck.team.xenobyte.modules.BlinkCam;
import forgefuck.team.xenobyte.modules.BuildMarkerGive;
import forgefuck.team.xenobyte.modules.CacheGive;
import forgefuck.team.xenobyte.modules.CarpenterUse;
import forgefuck.team.xenobyte.modules.Ceiling;
import forgefuck.team.xenobyte.modules.ChatBind;
import forgefuck.team.xenobyte.modules.CheckVanish;
import forgefuck.team.xenobyte.modules.ClientSpeed;
import forgefuck.team.xenobyte.modules.CmdTest;
import forgefuck.team.xenobyte.modules.CrayfishGive;
import forgefuck.team.xenobyte.modules.CrayfishNuker;
import forgefuck.team.xenobyte.modules.CreativeGive;
import forgefuck.team.xenobyte.modules.Credits;
import forgefuck.team.xenobyte.modules.EIOTeleport;
import forgefuck.team.xenobyte.modules.EIOXpGrab;
import forgefuck.team.xenobyte.modules.Esp;
import forgefuck.team.xenobyte.modules.ExtraFakeSlot;
import forgefuck.team.xenobyte.modules.FactoryDupe;
import forgefuck.team.xenobyte.modules.FactoryRocket;
import forgefuck.team.xenobyte.modules.FakeBreak;
import forgefuck.team.xenobyte.modules.FakeCreative;
import forgefuck.team.xenobyte.modules.FakeItem;
import forgefuck.team.xenobyte.modules.FastBreak;
import forgefuck.team.xenobyte.modules.FastPlace;
import forgefuck.team.xenobyte.modules.FluidWalk;
import forgefuck.team.xenobyte.modules.FullBright;
import forgefuck.team.xenobyte.modules.GalacticFire;
import forgefuck.team.xenobyte.modules.GiveSelect;
import forgefuck.team.xenobyte.modules.GuiReplacer;
import forgefuck.team.xenobyte.modules.HiJump;
import forgefuck.team.xenobyte.modules.MachineChaos;
import forgefuck.team.xenobyte.modules.MalisisDoors;
import forgefuck.team.xenobyte.modules.MatterGiveItem;
import forgefuck.team.xenobyte.modules.MekFire;
import forgefuck.team.xenobyte.modules.MekOpener;
import forgefuck.team.xenobyte.modules.NCPanelEdit;
import forgefuck.team.xenobyte.modules.NEIShowHidden;
import forgefuck.team.xenobyte.modules.NanoTechGive;
import forgefuck.team.xenobyte.modules.NoFall;
import forgefuck.team.xenobyte.modules.NoRain;
import forgefuck.team.xenobyte.modules.NoWeb;
import forgefuck.team.xenobyte.modules.OCShutDown;
import forgefuck.team.xenobyte.modules.OneWayTicket;
import forgefuck.team.xenobyte.modules.OpenCreative;
import forgefuck.team.xenobyte.modules.QuestGive;
import forgefuck.team.xenobyte.modules.RFCellDupe;
import forgefuck.team.xenobyte.modules.RadioHack;
import forgefuck.team.xenobyte.modules.RedBarrelGive;
import forgefuck.team.xenobyte.modules.RedGive;
import forgefuck.team.xenobyte.modules.RenderControl;
import forgefuck.team.xenobyte.modules.ScreenProtect;
import forgefuck.team.xenobyte.modules.Spider;
import forgefuck.team.xenobyte.modules.Step;
import forgefuck.team.xenobyte.modules.TainedAura;
import forgefuck.team.xenobyte.modules.TextRadar;
import forgefuck.team.xenobyte.modules.ThaumResearch;
import forgefuck.team.xenobyte.modules.ThaumicFinger;
import forgefuck.team.xenobyte.modules.ThaumicInvise;
import forgefuck.team.xenobyte.modules.TinkerChest;
import forgefuck.team.xenobyte.modules.TinkerGive;
import forgefuck.team.xenobyte.modules.TinkerNoFall;
import forgefuck.team.xenobyte.modules.TravellersGive;
import forgefuck.team.xenobyte.modules.TurretNuker;
import forgefuck.team.xenobyte.modules.VanilaNuker;
import forgefuck.team.xenobyte.modules.VanillaMagic;
import forgefuck.team.xenobyte.modules.WallHack;
import forgefuck.team.xenobyte.modules.WayLine;
import forgefuck.team.xenobyte.modules.Widgets;
import forgefuck.team.xenobyte.modules.XRay;
import forgefuck.team.xenobyte.modules.XRaySelect;
import forgefuck.team.xenobyte.modules.XenAura;
import forgefuck.team.xenobyte.modules.XenoFly;
import forgefuck.team.xenobyte.modules.XenoGui;
import forgefuck.team.xenobyte.modules.ZtonesMeta;

public class ModulesList extends ArrayList<CheatModule>  {
    
    {
        add(new AdvancedTooltip());
        add(new BuildMarkerGive());
        add(new BiblioAtlasGive());
        add(new BiblioTableGive());
        add(new BiblioSignEdit());
        add(new TravellersGive());
        add(new MatterGiveItem());
        add(new RenderControl());
        add(new AntiKnockBack());
        add(new NEIShowHidden());
        add(new ExtraFakeSlot());
        add(new FactoryRocket());
        add(new ThaumicFinger());
        add(new CrayfishNuker());
        add(new ThaumicInvise());
        add(new RedBarrelGive());
        add(new ScreenProtect());
        add(new ThaumResearch());
        add(new MalisisDoors());
        add(new OpenCreative());
        add(new CreativeGive());
        add(new VanillaMagic());
        add(new TinkerNoFall());
        add(new CarpenterUse());
        add(new CrayfishGive());
        add(new NanoTechGive());
        add(new FakeCreative());
        add(new GalacticFire());
        add(new OneWayTicket());
        add(new MachineChaos());
        add(new TurretNuker());
        add(new GuiReplacer());
        add(new VanilaNuker());
        add(new ClientSpeed());
        add(new TinkerChest());
        add(new FactoryDupe());
        add(new EIOTeleport());
        add(new NCPanelEdit());
        add(new CheckVanish());
        add(new OCShutDown());
        add(new ZtonesMeta());
        add(new GiveSelect());
        add(new XRaySelect());
        add(new FullBright());
        add(new AutoSprint());
        add(new TinkerGive());
        add(new AdvertHack());
        add(new RFCellDupe());
        add(new TainedAura());
        add(new EIOXpGrab());
        add(new QuestGive());
        add(new FastPlace());
        add(new FakeBreak());
        add(new FastBreak());
        add(new TextRadar());
        add(new FluidWalk());
        add(new RadioHack());
        add(new CacheGive());
        add(new MekOpener());
        add(new FakeItem());
        add(new ChatBind());
        add(new WallHack());
        add(new BlinkCam());
        add(new AutoDrop());
        add(new Credits());
        add(new Ceiling());
        add(new XenoFly());
        add(new WayLine());
        add(new XenAura());
        add(new XenoGui());
        add(new Widgets());
        add(new RedGive());
        add(new CmdTest());
        add(new MekFire());
        add(new HiJump());
        add(new Spider());
        add(new NoFall());
        add(new NoRain());
        add(new NoWeb());
        add(new Step());
        add(new XRay());
        add(new Esp());
    }
    
}