package mnm.mods.tabbychat.extra.filters;

import mnm.mods.tabbychat.TabbyChat;
import mnm.mods.tabbychat.api.Channel;
import mnm.mods.tabbychat.api.filters.Filter;
import mnm.mods.tabbychat.api.filters.FilterEvent;
import mnm.mods.tabbychat.settings.GeneralServerSettings;

import java.util.regex.Pattern;
import javax.annotation.Nonnull;

public class ChannelFilter implements Filter {

    @Nonnull
    @Override
    public Pattern getPattern() {
        return TabbyChat.getInstance().serverSettings.general.channelPattern.get().getPattern();
    }

    @Override
    public void action(FilterEvent event) {

        GeneralServerSettings general = TabbyChat.getInstance().serverSettings.general;
        if (general.channelsEnabled.get()) {
            String chan = event.matcher.group(1);
            Channel dest = TabbyChat.getInstance().getChat().getChannel(chan);
            event.channels.add(dest);

        }

    }
}
