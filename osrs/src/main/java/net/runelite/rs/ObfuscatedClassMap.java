package net.runelite.rs;

import java.util.HashMap;

public class ObfuscatedClassMap extends HashMap<String, String> {
    public static ObfuscatedClassMap INSTANCE = new ObfuscatedClassMap();
    static {
		INSTANCE.put("AABB", "iq");
		INSTANCE.put("AbstractArchive", "nm");
		INSTANCE.put("AbstractByteArrayCopier", "mx");
		INSTANCE.put("AbstractFont", "ou");
		INSTANCE.put("AbstractRasterProvider", "tk");
		INSTANCE.put("AbstractSocket", "ph");
		INSTANCE.put("AbstractSound", "cu");
		INSTANCE.put("AbstractUserComparator", "pz");
		INSTANCE.put("AbstractWorldMapData", "jz");
		INSTANCE.put("AbstractWorldMapIcon", "kg");
		INSTANCE.put("AccessFile", "sy");
		INSTANCE.put("Actor", "de");
		INSTANCE.put("Animation", "il");
		INSTANCE.put("ApproximateRouteStrategy", "cm");
		INSTANCE.put("Archive", "nd");
		INSTANCE.put("ArchiveDisk", "qk");
		INSTANCE.put("ArchiveDiskAction", "nw");
		INSTANCE.put("ArchiveDiskActionHandler", "ns");
		INSTANCE.put("ArchiveLoader", "dw");
		INSTANCE.put("AttackOption", "dj");
		INSTANCE.put("AudioFilter", "cn");
		INSTANCE.put("BoundaryObject", "jk");
		INSTANCE.put("Bounds", "qu");
		INSTANCE.put("Buddy", "pb");
		INSTANCE.put("BuddyRankComparator", "er");
		INSTANCE.put("Buffer", "sg");
		INSTANCE.put("BufferedFile", "sj");
		INSTANCE.put("BufferedNetSocket", "pv");
		INSTANCE.put("BufferedSink", "qe");
		INSTANCE.put("BufferedSource", "pn");
		INSTANCE.put("ByteArrayNode", "rl");
		INSTANCE.put("ByteArrayPool", "oj");
		INSTANCE.put("BZip2Decompressor", "sv");
		INSTANCE.put("BZip2State", "so");
		INSTANCE.put("Calendar", "ma");
		INSTANCE.put("Canvas", "ad");
		INSTANCE.put("ChatChannel", "cp");
		INSTANCE.put("ClanChannel", "gj");
		INSTANCE.put("ClanChannelMember", "fz");
		INSTANCE.put("ClanMate", "pd");
		INSTANCE.put("ClanSettings", "fj");
		INSTANCE.put("class0", "af");
		INSTANCE.put("class1", "an");
		INSTANCE.put("class10", "ay");
		INSTANCE.put("class100", "dn");
		INSTANCE.put("class101", "dy");
		INSTANCE.put("class103", "da");
		INSTANCE.put("class108", "ef");
		INSTANCE.put("class11", "ao");
		INSTANCE.put("class119", "ed");
		INSTANCE.put("class12", "ax");
		INSTANCE.put("class120", "ev");
		INSTANCE.put("class121", "em");
		INSTANCE.put("class122", "ew");
		INSTANCE.put("class123", "ex");
		INSTANCE.put("class124", "eh");
		INSTANCE.put("class125", "ek");
		INSTANCE.put("class126", "ey");
		INSTANCE.put("class127", "ec");
		INSTANCE.put("class128", "ei");
		INSTANCE.put("class129", "ee");
		INSTANCE.put("class13", "ai");
		INSTANCE.put("class130", "fe");
		INSTANCE.put("class131", "fs");
		INSTANCE.put("class132", "fi");
		INSTANCE.put("class133", "fh");
		INSTANCE.put("class134", "fl");
		INSTANCE.put("class135", "fp");
		INSTANCE.put("class136", "fo");
		INSTANCE.put("class137", "fx");
		INSTANCE.put("class138", "fd");
		INSTANCE.put("class139", "fb");
		INSTANCE.put("class14", "ag");
		INSTANCE.put("class140", "fn");
		INSTANCE.put("class142", "fa");
		INSTANCE.put("class143", "fy");
		INSTANCE.put("class144", "fw");
		INSTANCE.put("class145", "fr");
		INSTANCE.put("class146", "fv");
		INSTANCE.put("class147", "fq");
		INSTANCE.put("class148", "fc");
		INSTANCE.put("class149", "ff");
		INSTANCE.put("class15", "ah");
		INSTANCE.put("class151", "fg");
		INSTANCE.put("class152", "fk");
		INSTANCE.put("class153", "fm");
		INSTANCE.put("class154", "ft");
		INSTANCE.put("class155", "fu");
		INSTANCE.put("class156", "gr");
		INSTANCE.put("class157", "go");
		INSTANCE.put("class158", "gs");
		INSTANCE.put("class16", "av");
		INSTANCE.put("class160", "gg");
		INSTANCE.put("class161", "ge");
		INSTANCE.put("class162", "ga");
		INSTANCE.put("class163", "gt");
		INSTANCE.put("class165", "gh");
		INSTANCE.put("class166", "gy");
		INSTANCE.put("class168", "gw");
		INSTANCE.put("class17", "ar");
		INSTANCE.put("class170", "gf");
		INSTANCE.put("class172", "gi");
		INSTANCE.put("class173", "gq");
		INSTANCE.put("class174", "gk");
		INSTANCE.put("class177", "gn");
		INSTANCE.put("class18", "am");
		INSTANCE.put("class186", "hu");
		INSTANCE.put("class19", "as");
		INSTANCE.put("class192", "hl");
		INSTANCE.put("class195", "hc");
		INSTANCE.put("class2", "aw");
		INSTANCE.put("class20", "aj");
		INSTANCE.put("class204", "hp");
		INSTANCE.put("class205", "he");
		INSTANCE.put("class206", "hf");
		INSTANCE.put("class207", "hy");
		INSTANCE.put("class211", "iw");
		INSTANCE.put("class219", "ic");
		INSTANCE.put("class220", "ii");
		INSTANCE.put("class230", "id");
		INSTANCE.put("class235", "ji");
		INSTANCE.put("class237", "jx");
		INSTANCE.put("class244", "jn");
		INSTANCE.put("class252", "jy");
		INSTANCE.put("class26", "by");
		INSTANCE.put("class262", "kd");
		INSTANCE.put("class264", "kt");
		INSTANCE.put("class27", "bb");
		INSTANCE.put("class272", "ko");
		INSTANCE.put("class273", "kr");
		INSTANCE.put("class274", "kl");
		INSTANCE.put("class275", "kx");
		INSTANCE.put("class276", "kv");
		INSTANCE.put("class28", "bi");
		INSTANCE.put("class282", "ks");
		INSTANCE.put("class283", "kn");
		INSTANCE.put("class284", "kz");
		INSTANCE.put("class285", "km");
		INSTANCE.put("class29", "be");
		INSTANCE.put("class291", "li");
		INSTANCE.put("class292", "lu");
		INSTANCE.put("class293", "lk");
		INSTANCE.put("class294", "lh");
		INSTANCE.put("class295", "la");
		INSTANCE.put("class297", "ly");
		INSTANCE.put("class3", "ac");
		INSTANCE.put("class30", "bk");
		INSTANCE.put("class308", "lx");
		INSTANCE.put("class309", "lo");
		INSTANCE.put("class31", "bx");
		INSTANCE.put("class310", "lw");
		INSTANCE.put("class311", "lr");
		INSTANCE.put("class312", "mt");
		INSTANCE.put("class314", "mz");
		INSTANCE.put("class315", "mu");
		INSTANCE.put("class317", "mm");
		INSTANCE.put("class319", "mv");
		INSTANCE.put("class323", "mj");
		INSTANCE.put("class324", "ms");
		INSTANCE.put("class327", "mg");
		INSTANCE.put("class328", "mo");
		INSTANCE.put("class329", "mn");
		INSTANCE.put("class33", "bz");
		INSTANCE.put("class330", "mi");
		INSTANCE.put("class333", "ml");
		INSTANCE.put("class335", "my");
		INSTANCE.put("class337", "mb");
		INSTANCE.put("class349", "ng");
		INSTANCE.put("class354", "nf");
		INSTANCE.put("class355", "nc");
		INSTANCE.put("class356", "nj");
		INSTANCE.put("class357", "nv");
		INSTANCE.put("class36", "bt");
		INSTANCE.put("class369", "od");
		INSTANCE.put("class370", "ol");
		INSTANCE.put("class372", "of");
		INSTANCE.put("class373", "oy");
		INSTANCE.put("class374", "ot");
		INSTANCE.put("class375", "oh");
		INSTANCE.put("class376", "os");
		INSTANCE.put("class377", "oe");
		INSTANCE.put("class379", "oq");
		INSTANCE.put("class380", "ow");
		INSTANCE.put("class381", "om");
		INSTANCE.put("class383", "oa");
		INSTANCE.put("class384", "op");
		INSTANCE.put("class385", "oo");
		INSTANCE.put("class387", "ob");
		INSTANCE.put("class393", "pm");
		INSTANCE.put("class394", "pc");
		INSTANCE.put("class395", "pp");
		INSTANCE.put("class396", "py");
		INSTANCE.put("class397", "pg");
		INSTANCE.put("class398", "pk");
		INSTANCE.put("class399", "pj");
		INSTANCE.put("class4", "au");
		INSTANCE.put("class422", "qi");
		INSTANCE.put("class423", "qr");
		INSTANCE.put("class424", "qx");
		INSTANCE.put("class425", "qj");
		INSTANCE.put("class426", "qc");
		INSTANCE.put("class427", "qs");
		INSTANCE.put("class428", "qf");
		INSTANCE.put("class429", "qt");
		INSTANCE.put("class430", "qn");
		INSTANCE.put("class431", "qb");
		INSTANCE.put("class432", "qg");
		INSTANCE.put("class433", "qd");
		INSTANCE.put("class434", "qy");
		INSTANCE.put("class435", "qz");
		INSTANCE.put("class436", "qq");
		INSTANCE.put("class437", "qv");
		INSTANCE.put("class438", "qa");
		INSTANCE.put("class439", "qo");
		INSTANCE.put("class440", "qm");
		INSTANCE.put("class441", "qh");
		INSTANCE.put("class452", "rr");
		INSTANCE.put("class453", "rs");
		INSTANCE.put("class454", "rf");
		INSTANCE.put("class455", "rm");
		INSTANCE.put("class456", "rw");
		INSTANCE.put("class461", "rg");
		INSTANCE.put("class465", "rn");
		INSTANCE.put("class466", "ry");
		INSTANCE.put("class469", "sd");
		INSTANCE.put("class472", "sn");
		INSTANCE.put("class473", "su");
		INSTANCE.put("class474", "ss");
		INSTANCE.put("class475", "sa");
		INSTANCE.put("class476", "st");
		INSTANCE.put("class477", "sf");
		INSTANCE.put("class478", "sh");
		INSTANCE.put("class479", "si");
		INSTANCE.put("class482", "sk");
		INSTANCE.put("class484", "sc");
		INSTANCE.put("class485", "sb");
		INSTANCE.put("class489", "sx");
		INSTANCE.put("class492", "sp");
		INSTANCE.put("class493", "sr");
		INSTANCE.put("class496", "ts");
		INSTANCE.put("class497", "te");
		INSTANCE.put("class5", "ab");
		INSTANCE.put("class50", "bh");
		INSTANCE.put("class503", "tx");
		INSTANCE.put("class506", "tz");
		INSTANCE.put("class510", "to");
		INSTANCE.put("class513", "tl");
		INSTANCE.put("class6", "aq");
		INSTANCE.put("class68", "cv");
		INSTANCE.put("class7", "al");
		INSTANCE.put("class70", "co");
		INSTANCE.put("class8", "at");
		INSTANCE.put("class81", "do");
		INSTANCE.put("class85", "dk");
		INSTANCE.put("class86", "dt");
		INSTANCE.put("class88", "dz");
		INSTANCE.put("class9", "aa");
		INSTANCE.put("class96", "dq");
		INSTANCE.put("class97", "dd");
		INSTANCE.put("Client", "client");
		INSTANCE.put("ClientPacket", "lv");
		INSTANCE.put("ClientPreferences", "du");
		INSTANCE.put("Clips", "jg");
		INSTANCE.put("Clock", "gv");
		INSTANCE.put("CollisionMap", "if");
		INSTANCE.put("com/jagex/oldscape/pub/RefreshAccessTokenRequester", "com/jagex/oldscape/pub/RefreshAccessTokenRequester");
		INSTANCE.put("com/jagex/oldscape/pub/RefreshAccessTokenResponse", "com/jagex/oldscape/pub/RefreshAccessTokenResponse");
		INSTANCE.put("Coord", "lb");
		INSTANCE.put("DbRowType", "sz");
		INSTANCE.put("DbTableType", "sm");
		INSTANCE.put("Decimator", "cc");
		INSTANCE.put("DefaultsGroup", "qp");
		INSTANCE.put("DemotingHashTable", "ke");
		INSTANCE.put("DesktopPlatformInfoProvider", "re");
		INSTANCE.put("DevicePcmPlayer", "ae");
		INSTANCE.put("DevicePcmPlayerProvider", "az");
		INSTANCE.put("DirectByteArrayCopier", "mp");
		INSTANCE.put("DirectWrapper", "kp");
		INSTANCE.put("DualNode", "rk");
		INSTANCE.put("DualNodeDeque", "ni");
		INSTANCE.put("DynamicObject", "ct");
		INSTANCE.put("EnumComposition", "hx");
		INSTANCE.put("EvictingDualNodeHashTable", "kh");
		INSTANCE.put("FaceNormal", "ir");
		INSTANCE.put("FileSystem", "gm");
		INSTANCE.put("FillMode", "ta");
		INSTANCE.put("FloorDecoration", "ig");
		INSTANCE.put("FloorOverlayDefinition", "hk");
		INSTANCE.put("FloorUnderlayDefinition", "hr");
		INSTANCE.put("Font", "on");
		INSTANCE.put("FontName", "ri");
		INSTANCE.put("Fonts", "ra");
		INSTANCE.put("Frames", "io");
		INSTANCE.put("Friend", "pr");
		INSTANCE.put("FriendLoginUpdate", "pf");
		INSTANCE.put("FriendsChat", "ps");
		INSTANCE.put("FriendsList", "po");
		INSTANCE.put("FriendSystem", "cg");
		INSTANCE.put("GameBuild", "md");
		INSTANCE.put("GameEngine", "bm");
		INSTANCE.put("GameObject", "jj");
		INSTANCE.put("GrandExchangeEvent", "nu");
		INSTANCE.put("GrandExchangeEvents", "nr");
		INSTANCE.put("GrandExchangeOffer", "nb");
		INSTANCE.put("GrandExchangeOfferAgeComparator", "np");
		INSTANCE.put("GrandExchangeOfferNameComparator", "na");
		INSTANCE.put("GrandExchangeOfferOwnWorldComparator", "cf");
		INSTANCE.put("GrandExchangeOfferTotalQuantityComparator", "nn");
		INSTANCE.put("GrandExchangeOfferUnitPriceComparator", "nt");
		INSTANCE.put("GrandExchangeOfferWorldComparator", "ny");
		INSTANCE.put("GraphicsDefaults", "qw");
		INSTANCE.put("GraphicsObject", "cx");
		INSTANCE.put("GZipDecompressor", "tv");
		INSTANCE.put("HealthBar", "db");
		INSTANCE.put("HealthBarDefinition", "hm");
		INSTANCE.put("HealthBarUpdate", "dh");
		INSTANCE.put("HitSplatDefinition", "hb");
		INSTANCE.put("HorizontalAlignment", "hd");
		INSTANCE.put("Huffman", "me");
		INSTANCE.put("Ignored", "pi");
		INSTANCE.put("IgnoreList", "pu");
		INSTANCE.put("IndexedSprite", "tc");
		INSTANCE.put("Instrument", "ca");
		INSTANCE.put("IntegerNode", "rt");
		INSTANCE.put("InterfaceParent", "di");
		INSTANCE.put("Interpreter", "cy");
		INSTANCE.put("IntHashTable", "td");
		INSTANCE.put("InvDefinition", "gl");
		INSTANCE.put("IsaacCipher", "tp");
		INSTANCE.put("ItemComposition", "hz");
		INSTANCE.put("ItemContainer", "dc");
		INSTANCE.put("ItemLayer", "iy");
		INSTANCE.put("IterableDualNodeQueue", "ox");
		INSTANCE.put("IterableDualNodeQueueIterator", "ok");
		INSTANCE.put("IterableNodeDeque", "oi");
		INSTANCE.put("IterableNodeDequeDescendingIterator", "nq");
		INSTANCE.put("IterableNodeHashTable", "ro");
		INSTANCE.put("IterableNodeHashTableIterator", "rj");
		INSTANCE.put("JagexCache", "gc");
		INSTANCE.put("JSONArray", "org/json/JSONArray");
		INSTANCE.put("JSONException", "org/json/JSONException");
		INSTANCE.put("JSONObject$Null", "org/json/JSONObject$Null");
		INSTANCE.put("JSONObject", "org/json/JSONObject");
		INSTANCE.put("JSONString", "org/json/JSONString");
		INSTANCE.put("JSONTokener", "org/json/JSONTokener");
		INSTANCE.put("KeyHandler", "ap");
		INSTANCE.put("KitDefinition", "hj");
		INSTANCE.put("Language", "nx");
		INSTANCE.put("Link", "rx");
		INSTANCE.put("LinkDeque", "og");
		INSTANCE.put("Login", "cz");
		INSTANCE.put("LoginPacket", "lf");
		INSTANCE.put("LoginScreenAnimation", "dp");
		INSTANCE.put("LoginType", "sw");
		INSTANCE.put("LongNode", "rq");
		INSTANCE.put("MenuAction", "cb");
		INSTANCE.put("Message", "cq");
		INSTANCE.put("Messages", "eo");
		INSTANCE.put("MidiFileReader", "lt");
		INSTANCE.put("MidiPcmStream", "ln");
		INSTANCE.put("MilliClock", "gb");
		INSTANCE.put("Model", "it");
		INSTANCE.put("ModelData", "iz");
		INSTANCE.put("ModelData0", "jo");
		INSTANCE.put("ModeWhere", "ne");
		INSTANCE.put("MouseHandler", "bd");
		INSTANCE.put("MouseRecorder", "dl");
		INSTANCE.put("MouseWheelHandler", "ak");
		INSTANCE.put("MoveSpeed", "iu");
		INSTANCE.put("MusicPatch", "lz");
		INSTANCE.put("MusicPatchNode", "lq");
		INSTANCE.put("MusicPatchNode2", "lp");
		INSTANCE.put("MusicPatchPcmStream", "lc");
		INSTANCE.put("MusicTrack", "ld");
		INSTANCE.put("NanoClock", "gu");
		INSTANCE.put("net/runelite/rs/Opcodes", "net/runelite/rs/Opcodes");
		INSTANCE.put("NetCache", "nl");
		INSTANCE.put("NetFileRequest", "no");
		INSTANCE.put("NewShit", "hv");
		INSTANCE.put("Node", "rp");
		INSTANCE.put("NodeDeque", "nh");
		INSTANCE.put("NodeHashTable", "rc");
		INSTANCE.put("NPC", "df");
		INSTANCE.put("NPCComposition", "hs");
		INSTANCE.put("ObjectComposition", "hq");
		INSTANCE.put("ObjectNode", "rd");
		INSTANCE.put("ObjectSound", "cr");
		INSTANCE.put("ObjTypeCustomisation", "gx");
		INSTANCE.put("Occluder", "ip");
		INSTANCE.put("OtlTokenResponse", "com/jagex/oldscape/pub/OtlTokenResponse");
		INSTANCE.put("PacketBuffer", "sq");
		INSTANCE.put("PacketBufferNode", "lg");
		INSTANCE.put("PacketWriter", "eq");
		INSTANCE.put("ParamComposition", "ho");
		INSTANCE.put("PcmPlayer", "bu");
		INSTANCE.put("PcmStream", "bp");
		INSTANCE.put("PcmStreamMixer", "bn");
		INSTANCE.put("PcmStreamMixerListener", "cs");
		INSTANCE.put("PendingSpawn", "dg");
		INSTANCE.put("PlatformInfo", "rv");
		INSTANCE.put("PlatformInfoProvider", "rz");
		INSTANCE.put("Player", "dv");
		INSTANCE.put("PlayerComposition", "mw");
		INSTANCE.put("Players", "ds");
		INSTANCE.put("PlayerType", "nz");
		INSTANCE.put("PrivateChatMode", "tf");
		INSTANCE.put("Projectile", "cw");
		INSTANCE.put("Rasterizer2D", "th");
		INSTANCE.put("Rasterizer3D", "in");
		INSTANCE.put("RasterProvider", "bo");
		INSTANCE.put("RawPcmStream", "bl");
		INSTANCE.put("RawSound", "br");
		INSTANCE.put("ReflectionCheck", "bj");
		INSTANCE.put("Renderable", "iv");
		INSTANCE.put("RouteStrategy", "ia");
		INSTANCE.put("RunException", "tr");
		INSTANCE.put("Scene", "ie");
		INSTANCE.put("SceneTileModel", "ij");
		INSTANCE.put("SceneTilePaint", "jc");
		INSTANCE.put("Script", "ch");
		INSTANCE.put("ScriptEvent", "dr");
		INSTANCE.put("ScriptFrame", "ck");
		INSTANCE.put("SecureRandomCallable", "dm");
		INSTANCE.put("SecureRandomFuture", "cj");
		INSTANCE.put("SequenceDefinition", "ha");
		INSTANCE.put("ServerPacket", "ls");
		INSTANCE.put("Skeleton", "ik");
		INSTANCE.put("Skills", "mh");
		INSTANCE.put("SoftWrapper", "ky");
		INSTANCE.put("SoundCache", "ba");
		INSTANCE.put("SoundEffect", "bs");
		INSTANCE.put("SoundEnvelope", "bf");
		INSTANCE.put("SoundSystem", "bq");
		INSTANCE.put("SpotAnimation", "tt");
		INSTANCE.put("SpotAnimationDefinition", "hh");
		INSTANCE.put("SpriteMask", "ll");
		INSTANCE.put("SpritePixels", "tq");
		INSTANCE.put("Strings", "mk");
		INSTANCE.put("StructComposition", "ht");
		INSTANCE.put("StudioGame", "mr");
		INSTANCE.put("Task", "gp");
		INSTANCE.put("TaskHandler", "gd");
		INSTANCE.put("Texture", "ih");
		INSTANCE.put("TextureLoader", "jq");
		INSTANCE.put("TextureProvider", "im");
		INSTANCE.put("Tile", "is");
		INSTANCE.put("TileItem", "dx");
		INSTANCE.put("Tiles", "cd");
		INSTANCE.put("Timer", "or");
		INSTANCE.put("TriBool", "px");
		INSTANCE.put("UrlRequest", "ez");
		INSTANCE.put("UrlRequester", "et");
		INSTANCE.put("User", "pw");
		INSTANCE.put("UserComparator1", "tw");
		INSTANCE.put("UserComparator10", "en");
		INSTANCE.put("UserComparator2", "ty");
		INSTANCE.put("UserComparator3", "eb");
		INSTANCE.put("UserComparator4", "ej");
		INSTANCE.put("UserComparator5", "es");
		INSTANCE.put("UserComparator6", "eg");
		INSTANCE.put("UserComparator7", "eu");
		INSTANCE.put("UserComparator8", "ea");
		INSTANCE.put("UserComparator9", "el");
		INSTANCE.put("UserList", "pq");
		INSTANCE.put("Username", "tm");
		INSTANCE.put("Usernamed", "pt");
		INSTANCE.put("VarbitComposition", "hg");
		INSTANCE.put("VarcInt", "hi");
		INSTANCE.put("Varcs", "ep");
		INSTANCE.put("VarpDefinition", "gz");
		INSTANCE.put("Varps", "le");
		INSTANCE.put("VertexNormal", "ib");
		INSTANCE.put("VerticalAlignment", "hn");
		INSTANCE.put("ViewportMouse", "ix");
		INSTANCE.put("VorbisCodebook", "bw");
		INSTANCE.put("VorbisFloor", "bg");
		INSTANCE.put("VorbisMapping", "bc");
		INSTANCE.put("VorbisResidue", "bv");
		INSTANCE.put("VorbisSample", "ce");
		INSTANCE.put("WallDecoration", "je");
		INSTANCE.put("Widget", "mq");
		INSTANCE.put("World", "cl");
		INSTANCE.put("WorldMap", "rb");
		INSTANCE.put("WorldMapArchiveLoader", "rh");
		INSTANCE.put("WorldMapArea", "js");
		INSTANCE.put("WorldMapAreaData", "kk");
		INSTANCE.put("WorldMapCacheName", "kq");
		INSTANCE.put("WorldMapData_0", "jm");
		INSTANCE.put("WorldMapData_1", "jh");
		INSTANCE.put("WorldMapDecoration", "jl");
		INSTANCE.put("WorldMapDecorationType", "mc");
		INSTANCE.put("WorldMapElement", "hw");
		INSTANCE.put("WorldMapEvent", "ki");
		INSTANCE.put("WorldMapIcon_0", "jt");
		INSTANCE.put("WorldMapIcon_1", "jf");
		INSTANCE.put("WorldMapID", "kb");
		INSTANCE.put("WorldMapLabel", "ku");
		INSTANCE.put("WorldMapLabelSize", "jd");
		INSTANCE.put("WorldMapManager", "jv");
		INSTANCE.put("WorldMapRectangle", "ju");
		INSTANCE.put("WorldMapRegion", "jr");
		INSTANCE.put("WorldMapScaleHandler", "kj");
		INSTANCE.put("WorldMapSection", "kw");
		INSTANCE.put("WorldMapSection0", "ja");
		INSTANCE.put("WorldMapSection1", "ka");
		INSTANCE.put("WorldMapSection2", "jw");
		INSTANCE.put("WorldMapSectionType", "jb");
		INSTANCE.put("WorldMapSprite", "kc");
		INSTANCE.put("Wrapper", "kf");
		INSTANCE.put("ZoneOperation", "lm");
    }
}