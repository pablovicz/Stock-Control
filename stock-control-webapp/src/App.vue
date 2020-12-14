<template>
  <v-app id="inspire">
    <v-app-bar app clipped-left color="blue darken-3" dense>
      <!-- <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon> -->
      <v-img
        alt="Stock Control Logo"
        class="shrink mr-2"
        contain
        src="https://image.flaticon.com/icons/svg/2835/2835603.svg"
        transition="scale-transition"
        width="40"
        @click.stop="drawer = !drawer"
      />

      <v-img
        alt="Stock Control Name"
        class="shrink mt-1 hidden-sm-and-down"
        contain
        min-width="150"
        src="https://fontmeme.com/temporary/c49a33af55ea636f2312c518ad2a0b9b.png"
        width="150"
      />
      <v-spacer></v-spacer>
      <v-row align="center" style="max-width: 650px"></v-row>
    </v-app-bar>
    <v-main>
      <v-container class="fill-height">
        <v-row justify="center" align="center">
          <v-col class="shrink">
            <router-view />
          </v-col>
        </v-row>
      </v-container>
    </v-main>
    <v-footer dark padless>
      <v-card class="flex" flat tile>
        <v-card-title class="blue darken-3">
          <strong class="subheading">Get connected with us on social networks!</strong>

          <v-spacer></v-spacer>

          <v-btn v-for="icon in icons" :key="icon" class="mx-4" dark icon>
            <v-icon size="24px">{{ icon }}</v-icon>
          </v-btn>
        </v-card-title>

        <v-card-text class="py-2 white--text text-center">
          {{ new Date().getFullYear() }} —
          <strong>Pablovicz &copy;</strong>
        </v-card-text>
      </v-card>
    </v-footer>
  </v-app>

  <!-- <v-app>
    <v-app-bar app clipped-left class="blue darken-3">
      <div class="d-flex align-center">
        <v-img
          alt="Stock Control Logo"
          class="shrink mr-2"
          contain
          src="https://image.flaticon.com/icons/svg/2835/2835603.svg"
          transition="scale-transition"
          width="40"
        />

        <v-img
          alt="Stock Control Name"
          class="shrink mt-1 hidden-sm-and-down"
          contain
          min-width="150"
          src="https://fontmeme.com/temporary/c49a33af55ea636f2312c518ad2a0b9b.png"
          width="150"
        />
      </div>

      <v-spacer></v-spacer>
    </v-app-bar>

    <v-navigation-drawer permanent expand-on-hover class="blue-grey lighten-4">
      <v-list>
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-aps</v-icon>
          </v-list-item-icon>
          <v-list-item-title>Tools</v-list-item-title>
        </v-list-item>
      </v-list>

      <v-divider></v-divider>

      <v-list nav dense>
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-folder</v-icon>
          </v-list-item-icon>
          <v-list-item-title>My Files</v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-account-multiple</v-icon>
          </v-list-item-icon>
          <v-list-item-title>Shared with me</v-list-item-title>
        </v-list-item>
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-star</v-icon>
          </v-list-item-icon>
          <v-list-item-title>Starred</v-list-item-title>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-main>
      <v-container fluid class="grey lighten-4 fill-height">
        <v-row justify="center" align="center">
          <v-col class="shrink">
            <v-tooltip right>
              <template v-slot:activator="{ on }">
                <v-btn :href="source" icon large target="_blank" v-on="on">
                  <v-icon large>mdi-code-tags</v-icon>
                </v-btn>
              </template>
              <span>Source</span>
            </v-tooltip>
          </v-col>
        </v-row>
      </v-container>
    </v-main>
    <v-footer dark padless>
      <v-card class="flex" flat tile>
        <v-card-title class="blue darken-3">
          <strong class="subheading">Get connected with us on social networks!</strong>

          <v-spacer></v-spacer>

          <v-btn v-for="icon in icons" :key="icon" class="mx-4" dark icon>
            <v-icon size="24px">{{ icon }}</v-icon>
          </v-btn>
        </v-card-title>

        <v-card-text class="py-2 white--text text-center">
          {{ new Date().getFullYear() }} —
          <strong>Pablovicz &copy;</strong>
        </v-card-text>
      </v-card>
    </v-footer>
  </v-app>-->
</template>

<script>
export default {
  name: "App",

  data: () => ({
    icons: ["mdi-github", "mdi-linkedin"],
  }),
};
</script>
