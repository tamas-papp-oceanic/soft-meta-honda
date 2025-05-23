#!/bin/bash

export DISPLAY=:0

chromium \
--no-sandbox \
--kiosk \
--force-dark-mode \
--incognito \
--touch-events=enabled \
--disable-pinch \
--overscroll-history-navigation=0 \
--disable-features=TouchpadOverscrollHistoryNavigation \
--app=http://127.0.0.1 &
