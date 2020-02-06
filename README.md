Lndroid.Client - connect to Lightning wallets on Android
========================================================

Lndroid.Client is a client library for the IPC API of [Lndroid.Framework](https://github.com/lndroid/lndroid-framework/). Since the API is based on built-in Android components like Messenger, Binder and Handler, the code is the same both for in-process and inter-process access. The code is simply a subset of Lndroid.Framework source files, hosted in this separate repo. 

To see a wallet based on Lndroid.Framework, check [Lndroid.Wallet](https://github.com/lndroid/lndroid-wallet/). To see an app integrated with a Lightning wallet, check [Lndroid.Messenger](https://github.com/lndroid/lndroid-messenger/).

To see sample app+wallet in action, check this video.

# TODO

...This readme is just an intro, expand it to properly cover what Lndroid does, and how to use it...

# Dependencies

1. AutoValue
2. Guava
3. Gson

# Important

The whole Lndroid project is at the very early stages of development. No guarantees are made about API stability, or the like. Do not use Lndroid code on Bitcoin mainnet, as you're very likely to lose your funds.

# License

MIT

# Author

Artur Brugeman, brugeman.artur@gmail.com